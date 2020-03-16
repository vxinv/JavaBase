package com.lixin.pytest;

import com.lixin.constant.FilePath;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class PyExe {

    public static void main(String[] args) throws IOException, InterruptedException {
        String exe = "python";
        String property = System.getProperty("user.dir");

        String num1 = "1";
        String num2 = "2";

        String[] cmdArr = new String[] {exe, property+ FilePath.sell, num1, num2};

        Process process = Runtime.getRuntime().exec(cmdArr);
        InputStream is = process.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String str = dis.readLine();
        process.waitFor();
        System.out.println(str);
    }
}
