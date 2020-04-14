package com.lixin;

import cn.hutool.core.text.StrFormatter;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.lixin.constant.StockUrl;
import com.lixin.utils.StockUtils;
import org.springframework.stereotype.Service;

import javax.sound.midi.SoundbankResource;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.lixin.constant.API.JSON;

/*网页的分析 数据的获取*/
@Service
public class SimStockInfoProcessService {

    static Pattern inpattern = Pattern.compile("<tr>[\\s\\S]+?href=\"(http[\\s\\S]+?)\"[\\s\\S]+?>([\\s\\S]+?)</a[\\s\\S]+?>[\\s\\S]+?\">[.|\\d]+?</td");
    static Pattern slpattern = Pattern.compile("<a href=\"http[\\s\\S]+?blank\">([\\d]{6})</a>[\\s\\S]+?=\"_blank\">([\\D]{3,5})</a>");

    /*获取行业信息*/
    public static Map<String, String> getIndustry(){
        String listHtml = HttpUtil.get(StrFormatter.format(StockUrl.getIndusturyStockList, 1));
        /*正则提取*/

        Matcher matcher = inpattern.matcher(listHtml);
        HashMap<String, String> urlName = new HashMap<>();

        while (matcher.find()){
            /*获取该行业的股票连接*/
            urlName.put(matcher.group(1), matcher.group(2));
        }
        return urlName;
    }

    /*根据获取的行业信息 获取该行业的所有的股票代码*/
    public static void getAllCodeFromIndustrial(String url,String iname){
        String stockList = HttpUtil.get(url);
        Matcher matcher = slpattern.matcher(stockList);
        while (matcher.find()){
            /*找出获取的代号*/
            String group = matcher.group(1);
            System.out.println(group);
            String group1 = matcher.group(2);
            System.out.println(group1);
            /**/
        }

    }

    public static void main(String[] args) {
        Map<String, String> industry = getIndustry();
        for (Map.Entry<String, String> stringStringEntry : industry.entrySet()){
            getAllCodeFromIndustrial(stringStringEntry.getKey(), stringStringEntry.getValue());
        }
    }
    /*根据同花顺 行业获取该行业所有的代码*/


}
