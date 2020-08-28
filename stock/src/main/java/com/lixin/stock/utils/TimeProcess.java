package com.lixin.stock.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeProcess {

    public static DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    public static Logger log = LoggerFactory.getLogger(TimeProcess.class);

    public static String getPreTime(int n) {
        LocalDate currDate = LocalDate.now();
        LocalDate localDate = currDate.plusDays(0 - n);
        return localDate.format(dateFormat);
    }

    public static Date string2Date(String dateString) {
        try {
            return simpleDateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
