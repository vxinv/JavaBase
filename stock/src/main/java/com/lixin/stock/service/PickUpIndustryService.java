package com.lixin.stock.service;

import com.lixin.stock.entity.StockInfoList;
import com.lixin.stock.entity.StockInfoResDTO;
import com.lixin.stock.mapper.IndustrySimpleMapper;
import com.lixin.stock.mapper.StockCodeMapper;
import com.lixin.stock.model.StockCode;
import com.lixin.stock.service.impl.XQStockHistoryDataGetServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PickUpIndustryService {

    Logger LOG = LoggerFactory.getLogger(PickUpIndustryService.class);

    @Autowired
    WebClientService webClientService;
    String info_list = "https://xueqiu.com/service/v5/stock/screener/quote/list?page=1&size=30&order=desc&order_by=percent&exchange=CN&market=CN&ind_code=S2701&_=1599030262648";
    String url_prefix = "https://xueqiu.com/hq#exchange=CN&plate={}&firstName={}&secondName={}&level2code={}";

    @Autowired
    IndustrySimpleMapper ism;

    @Autowired
    XQStockHistoryDataGetServiceImpl xqStockHistoryDataGetService;

    @Autowired
    StockCodeMapper stockCodeMapper;

  /*  public void pickUp() {

        List<IndustrySimple> industrySimples = ism.selectByExample(null);
        for (IndustrySimple industrySimple : industrySimples) {
            //String str = StrUtil.format(url_prefix, industrySimple.getPlate(), industrySimple.getFirstName(), industrySimple.getSecondName(), industrySimple.getLevel2code());
            StockInfoResDTO stockInfo = xqStockHistoryDataGetService.getStockInfo(industrySimple.getLevel2code());
            if (stockInfo.getData() != null ){
                for (StockInfoList si : stockInfo.getData().getList()) {
                    StockCode stockCode = new StockCode();
                    stockCode.setStockCode(si.getSymbol());
                    stockCode.setCompanyName(si.getName());
                    stockCode.setFloatMarketCapital(si.getFloat_market_capital());
                    stockCode.setIndustry(industrySimple.getTitie());
                    stockCode.setFloatShares(si.getFloat_shares());
                    stockCode.setNetProfitCagr(si.getNet_profit_cagr());
                    stockCode.setMarketCapital(si.getMarket_capital());
                    stockCode.setTotalShares(si.getTotal_shares());

                    stockCodeMapper.insertSelective(stockCode);
                }

            }else {
                LOG.error(stockInfo.getError_description());
            }

        }
    }*/

    public void pickUp2() {

        ArrayList<StockInfoList> stockCodes = new ArrayList<>();

        StockInfoResDTO allStock = xqStockHistoryDataGetService.getGetAllStock(1);
        int times = Math.round(allStock.getData().getCount() / 90) + 1;
        for (int i = 1; i <= times; i++) {
            StockInfoResDTO getAllStock = xqStockHistoryDataGetService.getGetAllStock(i);
            stockCodes.addAll(getAllStock.getData().getList());
        }
        System.out.println(stockCodes.size());
        for (StockInfoList si : stockCodes) {

            if (si.getName().startsWith("N") || si.getName().startsWith("*") || si.getName().length() > 5) {
                System.out.println(si.getName() + "跳过录入");
                continue;
            }
            StockCode stockCode = new StockCode();

            stockCode.setStockCode(si.getSymbol());
            stockCode.setCompanyName(si.getName());
            stockCode.setFloatMarketCapital(si.getFloat_market_capital());

            stockCode.setFloatShares(si.getFloat_shares());
            stockCode.setNetProfitCagr(si.getNet_profit_cagr());
            stockCode.setTotalAssets(si.getMarket_capital());
            stockCode.setTotalShares(si.getTotal_shares());

            String[] categoryByCode = xqStockHistoryDataGetService.getCategoryByCode(si.getSymbol().substring(2));

            for (int i = 0; i < categoryByCode.length; i++) {
                if (i == 0) {
                    stockCode.setOneCategory(categoryByCode[0]);
                    stockCode.setOneCategoryId(categoryByCode[0].hashCode());
                } else if (i == 1) {
                    stockCode.setTwoCategory(categoryByCode[1]);
                    stockCode.setTwoCategoryId(categoryByCode[1].hashCode());
                } else if (i == 2) {
                    stockCode.setThreeCategory(categoryByCode[2]);
                    stockCode.setThreeCategoryId(categoryByCode[2].hashCode());
                }
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            stockCodeMapper.insertSelective(stockCode);
            System.out.println(stockCode.getCompanyName() + "录入完毕");
        }
    }

    //http://stockpage.10jqka.com.cn/000876/field/
    public void getCategory() {

        Optional<String> page = webClientService.getPage("http://stockpage.10jqka.com.cn/000876/field/", 10000);
        System.out.println(page.get());
    }


}
