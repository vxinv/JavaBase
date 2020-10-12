package com.lixin.stock.utils;

import cn.hutool.core.io.FileUtil;
import org.nustaq.serialization.FSTConfiguration;
import org.nustaq.serialization.FSTObjectInput;
import org.nustaq.serialization.FSTObjectOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 序列化文件
 * 反序列化
 */
public class FSTUtils {
    static FSTConfiguration conf = FSTConfiguration.createDefaultConfiguration();
    static String codePrefix = "./stock/src/main/resources/stock";

    public static <T> T read(String name, Class<T> c) throws Exception {
        String uri = codePrefix + File.separator + name + ".s";
        FileInputStream fileInputStream = new FileInputStream(new File(buildUri(name)));
        FSTObjectInput in = conf.getObjectInput(fileInputStream);
        T result = (T) in.readObject(c);
        // DON'T: in.close(); here prevents reuse and will result in an exception
        fileInputStream.close();
        return result;
    }

    public static <T> void write(String name, T object, Class... possibles) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream(new File(buildUri(name)));
        FSTObjectOutput out = conf.getObjectOutput(fileOutputStream);
        out.writeObject(object, possibles);
        // DON'T out.close() when using factory method;
        out.flush();
        fileOutputStream.close();
    }

    public static boolean hasThisFile(String name) {
        return FileUtil.exist(new File(buildUri(name)));
    }

    public static String buildUri(String name) {
        return codePrefix + File.separator + name + ".s";
    }

    public static void main(String[] args) {
        System.out.println(FSTUtils.hasThisFile("sh3232"));
    }
}
