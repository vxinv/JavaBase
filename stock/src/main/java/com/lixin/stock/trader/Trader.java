//package com.lixin.stock.trader;
//
//import com.lixin.stock.constant.FilePath;
//import org.junit.Test;
//
//import java.io.*;
//
//public class Trader {
//
//    Runtime runtime = Runtime.getRuntime();
//
//    /**
//     * 检查单子
//     */
//    @Test
//    public void  checkStockTradeInfo() throws InterruptedException, IOException {
//
//        Process process = runtime.exec(FilePath.checkorder);
//        BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream(),"GBK"));
//        process.waitFor();
//        String line ;
//        while ((line = in.readLine())!=null){
//            System.out.println("-------------------");
//            System.out.println(line);
//        }
//        in.close();
//        System.out.println("结束");
//
//    }
//}
