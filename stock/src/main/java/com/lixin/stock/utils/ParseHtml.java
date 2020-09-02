package com.lixin.stock.utils;

import cn.hutool.core.io.file.FileReader;
import com.lixin.stock.mapper.IndustrySimpleMapper;
import com.lixin.stock.model.IndustrySimple;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ParseHtml {

    static Pattern slpattern = Pattern.compile("plate=([_0-9]{6,})&amp;firstName=([0-9]+)&amp;secondName=([_0-9]{3,})&amp;level2code=([\\w]{5,})[\\S\\s]{2}title=\"([\\S\\s]{3,9}?)\"");


    public void getHangye(IndustrySimpleMapper ism) {

        FileReader fileReader = new FileReader("/Volumes/macApp/App/JavaBase/stock/src/main/resources/file/analysize.txt");
        String s = fileReader.readString();

        Matcher matcher = slpattern.matcher(s);

        while (matcher.find()) {
            IndustrySimple industrySimple = new IndustrySimple();
            industrySimple.setPlate(matcher.group(1));
            industrySimple.setFirstName(matcher.group(2));
            industrySimple.setSecondName(matcher.group(3));
            industrySimple.setLevel2code(matcher.group(4));
            industrySimple.setTitie(matcher.group(5));
            ism.insert(industrySimple);
            System.out.println("  " + matcher.group(1) + " " + matcher.group(2) + " " + matcher.group(3) + " " + matcher.group(4) + " " + matcher.group(5));
        }

    }


}
