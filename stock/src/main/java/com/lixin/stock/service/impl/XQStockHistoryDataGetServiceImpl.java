package com.lixin.stock.service.impl;

import cn.hutool.core.exceptions.ExceptionUtil;
import cn.hutool.core.text.StrFormatter;
import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpUtil;
import com.lixin.stock.constant.StockUrl;
import com.lixin.stock.entity.StockInfoResDTO;
import com.lixin.stock.entity.XQStockData;
import com.lixin.stock.model.StockNdata;
import com.lixin.stock.service.StockHistoryDataGetService;
import com.lixin.stock.service.WebClientService;
import com.lixin.stock.utils.JsonUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;


/*基于雪球的股票数据获取*/
@Service
public class XQStockHistoryDataGetServiceImpl implements StockHistoryDataGetService {

    boolean hasLogin = false;

    LocalDateTime lastLoginTime = LocalDateTime.now();

    String getStockInfo_prefix = "https://xueqiu.com/service/v5/stock/screener/quote/list?page=1&size=90&order=desc&order_by=percent&exchange=CN&market=CN&ind_code={}&_={}";

    String getAllStock = "https://xueqiu.com/service/v5/stock/screener/quote/list?page={}&size=90&order=desc&orderby=percent&order_by=percent&market=CN&type=sh_sz&_={}";

    String getAllCategoryFromTHS = "http://basic.10jqka.com.cn/{}/field.html";

    Pattern pattern = Pattern.compile("");

    @Autowired
    WebClientService webClientService;

    XQStockHistoryDataGetServiceImpl() {
        HttpUtil.get("https://xueqiu.com/");
    }
   /* public static void main(String[] args) {
        List<StockData> historyList = new XQStockHistoryDataGetServiceImpl().getHistoryList("000063");
        System.out.println(historyList);
    }*/

    public XQStockHistoryDataGetServiceImpl(boolean hasLogin) {
        this.hasLogin = hasLogin;
    }

    private float valueF(Object o) {
        return Float.parseFloat(String.valueOf(o));
    }

    public static void main(String[] args) {
        /*String[] categoryByCode = new XQStockHistoryDataGetServiceImpl().getCategoryByCode("000876");
        for (String s : categoryByCode) {
            System.out.println(s);
        }*/
    }

    /**
     * 获取最近三年的股票前复权数据
     *
     * @param code 股票代码
     * @return 三年的数据
     */
    public List<StockNdata> getHistoryList(String code) {
        if (!hasLogin) {
            HttpUtil.get("https://xueqiu.com/");
            hasLogin = true;
        }
        String url = StrFormatter.format(StockUrl.xq_day_K_scode_tcode, code, String.valueOf(System.currentTimeMillis()), 7);
        String body = HttpUtil.get(url);

        XQStockData xqStockData = JsonUtil.convertJsonStringToObject(body, XQStockData.class);
        List<StockNdata> stockData = new ArrayList<>();

        for (List<String> list : xqStockData.getData().getItem()) {

            StockNdata snd = new StockNdata();
            snd.setCode(code);
            Instant instant = Instant.ofEpochMilli(Long.parseLong(Optional.ofNullable(list.get(0)).orElse("0")));
            snd.setTimestamp(LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate());
            snd.setVolume(Long.parseLong(Optional.ofNullable(list.get(1)).orElse("0")));
            snd.setOpen(BigDecimal.valueOf(Double.parseDouble(Optional.ofNullable(list.get(2)).orElse("0"))));
            snd.setHigh(BigDecimal.valueOf(Double.parseDouble(Optional.ofNullable(list.get(3)).orElse("0"))));
            snd.setLow(BigDecimal.valueOf(Double.parseDouble(Optional.ofNullable(list.get(4)).orElse("0"))));
            snd.setClose(BigDecimal.valueOf(Double.parseDouble(Optional.ofNullable(list.get(5)).orElse("0"))));
            snd.setChg(Float.parseFloat(Optional.ofNullable(list.get(6)).orElse("0")));
            snd.setPercent(Float.parseFloat(Optional.ofNullable(list.get(7)).orElse("0")));
            snd.setTurnoverrate(Float.parseFloat(Optional.ofNullable(list.get(8)).orElse("0")));
            snd.setAmount(Double.parseDouble(Optional.ofNullable(list.get(9)).orElse("0")));
            snd.setPe(Float.parseFloat(Optional.ofNullable(list.get(12)).orElse("0")));
            snd.setPb(Float.parseFloat(Optional.ofNullable(list.get(13)).orElse("0")));
            snd.setPs(Float.parseFloat(Optional.ofNullable(list.get(14)).orElse("0")));
            snd.setPcf(Float.parseFloat(Optional.ofNullable(list.get(15)).orElse("0")));
            snd.setMarketCapital(Float.parseFloat(Optional.ofNullable(list.get(16)).orElse("0")));
            snd.setHoldVolumeCn(Double.parseDouble(Optional.ofNullable(list.get(18)).orElse("0")));
            snd.setHoldRatioCn(Float.parseFloat(Optional.ofNullable(list.get(20)).orElse("0")));
            snd.setNetVolumeCn(Long.parseLong(Optional.ofNullable(list.get(21)).orElse("0")));

            stockData.add(snd);
        }
        return stockData;
    }

    /**
     * 获取某个行业的所有股票代码 以及 公司数据
     */
    // https://xueqiu.com/service/v5/stock/screener/quote/list?page=1&size=90&order=desc&order_by=percent&exchange=CN&market=CN&ind_code=S2701&_=1599030262648
    public StockInfoResDTO getStockInfo(String ind_code) {

        if (LocalDateTime.now().plusDays(-1).isAfter(lastLoginTime)) {
            HttpUtil.get("https://xueqiu.com/");
            lastLoginTime = LocalDateTime.now();
        }
        String format = StrUtil.format(getStockInfo_prefix, ind_code, System.currentTimeMillis());
        String body = HttpUtil.get(format);

        return JsonUtil.convertJsonStringToObject(body, StockInfoResDTO.class);
    }

    /**
     * 获取行业的分类
     */
    public String getStockInfoFromTHS(String code) {
        String format = StrUtil.format(getAllCategoryFromTHS, code);
        String body = HttpUtil.get(format);
        return null;
    }

    // 处理htmlUtil
    private void processHtmlUtil(String url) {
        if (LocalDateTime.now().plusDays(-1).isAfter(lastLoginTime)) {
            HttpUtil.get("https://xueqiu.com/");
            lastLoginTime = LocalDateTime.now();
        }
    }

    // 获取沪深所有的股票
    public StockInfoResDTO getGetAllStock(int pageNum) {
        String format = StrUtil.format(getAllStock, pageNum, System.currentTimeMillis());
        String body = HttpUtil.get(format);
        return JsonUtil.convertJsonStringToObject(body, StockInfoResDTO.class);
    }

    // 获取三级分类
    public String[] getCategoryByCode(String code) {
        String format = StrUtil.format(getAllCategoryFromTHS, code);
        try {
            Document document = Jsoup.connect(format).get();
            Element fieldsChartData = document.getElementById("fieldsChartData");
            Elements tip_f14 = document.getElementsByClass("tip f14");
            String fenlei = tip_f14.get(0).text();
            String[] two = fenlei.split(" （");
            return two[0].split(" -- ");

        } catch (Exception e) {
            ExceptionUtil.getSimpleMessage(e);
            return new String[]{"", "", ""};
        }
    }


    //http://basic.10jqka.com.cn/000876/field.html


}
