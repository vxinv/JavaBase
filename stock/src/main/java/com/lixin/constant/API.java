package com.lixin.constant;

import okhttp3.*;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 李鑫
 * @version 1.0
 * @date 2019/7/20 15:42
 * @desc
 */
public class API {
    // 类型支持
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    //

    // 请求客户端
     OkHttpClient client ;

     Request.Builder builder;

     StringBuilder basicUrl ;

     StringBuilder urlRequst ;

     HashMap<String,Object> postBody;
     
     public static  API ME(HOST host){

         API api = new API();
         api.basicUrl = new StringBuilder(host.getHostName());
         return api;
     }

    public API() {
        client = new OkHttpClient();
        builder = new Request.Builder();
        urlRequst = new StringBuilder("");
        postBody = new HashMap<>();
    }

    /**
     * 加入固定请求头
     * @param map 请求头
     */
    
    public API fixHead(HashMap<String,Object> map){
        for (Map.Entry<String,Object> entry : map.entrySet()){
            builder.addHeader(entry.getKey(),  entry.getValue().toString());
        }

        return this;
    }

    public  API addReqUrl(String string){
         urlRequst.append(string);
         return this;
    }

    // 添加requstURL
    public  API  addReqUrl (Object object)  {
        if (object instanceof HashMap){
            HashMap<String,String> maps = (HashMap<String, String>) object;
            for (Map.Entry<String,String> entry: maps.entrySet()) {
                urlRequst.append(entry.getKey());
                urlRequst.append("=");
                urlRequst.append(entry.getValue().toString());
                urlRequst.append("&");
            }
            return this;
        }
        // 获取所有的feild
        Field[] declaredFields = object.getClass().getDeclaredFields();
        // 组装url
        try {
            for (Field field : declaredFields){
                field.setAccessible(true);
                if(field.get(object)==null){
                    continue;
                }
                urlRequst.append(field.getName());
                urlRequst.append("=");
                urlRequst.append(field.get(object).toString());
                urlRequst.append("&");
            }
        }catch (Exception e){}
        return this;
    }

    // 添加basic的URL路径
    public API addBasUrl (String url){
        basicUrl.append(url);
        return this;
    }


    // 发送GET请求
    public String  GET(){

        StringBuilder getUrl = basicUrl;

        int i = urlRequst.lastIndexOf("&");
        if (-1!=i){
            urlRequst.deleteCharAt(i);
        }
        getUrl.append(urlRequst);

        Request request = builder.url(getUrl.toString()).build();
        Call call = client.newCall(request);
        try {
            Response response = call.execute();

            return response.body() != null ? response.body().string() : null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    public void GET(String raw){
        StringBuilder getUrl = basicUrl;
        getUrl.append(urlRequst);
        System.out.println("GET ===>"+getUrl.toString());

        Request request = builder.url(getUrl.toString()).build();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Call call = client.newCall(request);
        try {
            Response response = call.execute();
            if (response.body() != null) {
                System.out.println(response.body().string());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // 添加请求的body
    public API packReqBody(Object object){
        if (object instanceof HashMap){
            HashMap<String,Object> maps = (HashMap<String, Object>) object;
            postBody.putAll(maps);
            return this;
        }

        Field[] declaredFields = object.getClass().getDeclaredFields();
        try {
            for (Field field : declaredFields){
                field.setAccessible(true);
                if(field.get(object)==null){
                    continue;
                }
                postBody.put(field.getName(),field.get(object).toString());
            }
        }catch (Exception e){}
        return this;
    }

    // 发送POST
    public void POST(){
         RequestBody body = RequestBody.create(JSON, com.alibaba.fastjson.JSON.toJSONBytes(postBody));
         Request request = builder.url(basicUrl.toString()).post(body).build();
         System.out.println(basicUrl.toString());
         try {
             Response execute = client.newCall(request).execute();
             System.out.println(execute.body().string());
         } catch (IOException e) {
             System.out.println("POST  失败");
             e.printStackTrace();
         }
     }

     public API MatchingWords(String... strings){
         basicUrl = new StringBuilder(HOST.ifeng.getHostName().replaceFirst("#\\{\\w+\\}",strings[0]));
         return this;
     }

    /**
     * 网络基本地址
     */
    public enum  HOST {
        sina("http://hq.sinajs.cn/rn=cyei3&list="),
        ifeng("http://api.finance.ifeng.com/akdaily/?code=#{sh603806}&type=last"),
        sohu("http://q.stock.sohu.com/hisHq?");

       private String hostName;

       HOST(String hostName) {
           this.hostName = hostName;
       }

       public String getHostName() {
           return hostName;
       }

       public void setHostName(String hostName) {
           this.hostName = hostName;
       }
   }

    /**
     * https://stock.xueqiu.com/v5/stock/chart/kline.json?symbol=SZ002223&begin=1581081841776&period=day
     * &type=before&count=-142&indicator=kline,pe,pb,ps,pcf,market_capital,agt,ggt,balance
     */

}

