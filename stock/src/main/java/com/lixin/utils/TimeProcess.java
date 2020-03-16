package com.lixin.utils;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class TimeProcess {

    public static DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");



    public static  String getPreTime(int n){
        LocalDate currDate = LocalDate.now();
        LocalDate localDate = currDate.plusDays(0 - n);
        return  localDate.format(dateFormat);
    }

    /*public static void main(String[] args) {
        System.out.println(getPreTime(2));
    }*/
}
