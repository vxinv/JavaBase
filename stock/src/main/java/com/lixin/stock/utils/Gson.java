package com.lixin.stock.utils;


import com.google.gson.GsonBuilder;

public class Gson {
   public static com.google.gson.Gson GJSON = new GsonBuilder().serializeNulls().create();
}
