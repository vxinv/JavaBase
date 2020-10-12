package com.lixin.guava;

import cn.hutool.core.io.FileUtil;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * 文件操作
 */
public class FilesTest {

    String absolutePath = "/Users/yons/Documents/App/JavaBase/test4j/src/main/java/com/lixin/guava/testFile";
    String relativePath = "../testRelativeFile";


    @Test
    @DisplayName("testFileTouch")
    public void testTouchFile() throws IOException {
        String properties = System.getProperty("user.dir");
        System.out.println("property = " + properties);
        File touchFile = new File(relativePath);

        File touch = FileUtil.touch(touchFile);
        System.out.println("touch.getAbsolutePath() = " + touch.getAbsolutePath());
    }

    @Test
    public void deleteFile() {
        boolean del = FileUtil.del(absolutePath);
        System.out.println("del = " + del);
    }

    @Test
    public void getPath() throws IOException {
        File file = new File(".");
        System.out.println(file.getCanonicalPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        ClassPathResource classPathResource = new ClassPathResource("/log4j2.xml");
        System.out.println(classPathResource.getPath());
        System.out.println(classPathResource.getURL());
        InputStream inputStream = classPathResource.getInputStream();
        FileUtil.writeFromStream(inputStream, file.getCanonicalPath() + File.separator + "testFile.txt");
    }


}
