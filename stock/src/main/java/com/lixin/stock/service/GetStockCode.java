package com.lixin.stock.service;
import com.lixin.stock.model.StockCode;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class GetStockCode {




    /**
     * 获取股票的简略信息
     * @param fileName 文件的路径
     * @return
     */

    public ArrayList<StockCode> getSimStockInfo(String fileName){

        ArrayList<StockCode> simStockInfos = new ArrayList<>();
        String path = "file/"+fileName+"所有股票.txt";
        try {
            ClassPathResource classPathResource = new ClassPathResource(path);
            InputStream inputStream = classPathResource.getInputStream();
            ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
            byte[] bytes = new byte[1024];
            int i = 0;
            while ((i = inputStream.read(bytes))!=-1){
                arrayOutputStream.write(bytes,0,i);
            }
            String string = arrayOutputStream.toString("UTF-8");
            Pattern pattern = Pattern.compile("<td>([\\d]{6})</td>[\\s\\S]+?<td class[\\S\\s]+?><a class[\\s\\S]+?>([\\S]+?)</a[\\S\\s]+?color=\"#808080\">([\\S]+?)</font");
            Matcher matcher = pattern.matcher(string);
            int j = 0;

            while (matcher.find()){
                j ++;
                StockCode simStockInfo = new StockCode();
                simStockInfo.setCompanyName(matcher.group(2));
                simStockInfo.setStockCode(matcher.group(1));

                simStockInfos.add(simStockInfo);
                System.out.println("公司名称: "+matcher.group(2) +" 股票代码: "+matcher.group(1) +" 所属行业: "+matcher.group(3));
            }

            System.out.println(j);
            inputStream.close();
            arrayOutputStream.close();
        } catch (IOException e) {

            e.printStackTrace();
        }

        return simStockInfos;
    }


    /*http://q.10jqka.com.cn/index/index/board/hs/field/zdf/order/desc/page/1/ajax/1/*/
    /*http://q.10jqka.com.cn/index/index/board/hs/field/zdf/order/desc/page/2/ajax/1/*/

    /*获取板块信息*/
    /*http://q.10jqka.com.cn/thshy/index/field/199112/order/desc/page/2/ajax/1/*/
}
