package com.lixin.stockGain;

import com.lixin.entity.SimStockInfo;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
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
    public ArrayList<SimStockInfo> getSimStockInfo(String fileName){

        ArrayList<SimStockInfo> simStockInfos = new ArrayList<>();

        try {
            /*D:\JavaWeb\work-proxy\stock\src\main\resources\上海所有股票.txt*/
            FileInputStream inputStream = new FileInputStream("D:\\JavaWeb\\work-proxy\\stock\\src\\main\\resources\\"+fileName+"所有股票.txt");
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
                SimStockInfo simStockInfo = new SimStockInfo();
                simStockInfo.setComName(matcher.group(2));
                simStockInfo.setCode(matcher.group(1));
                simStockInfo.setIndustry(matcher.group(3));

                simStockInfos.add(simStockInfo);
                /*String[] strings = new String[3];*/
                /*strings[0]=matcher.group(2);
                strings[1]=matcher.group(1);
                strings[2]=matcher.group(3);
                StockCollection.add(strings);*/
                //System.out.println("公司名称: "+matcher.group(2) +" 股票代码: "+matcher.group(1) +" 所属行业: "+matcher.group(3));
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
