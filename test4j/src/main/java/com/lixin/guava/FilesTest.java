package com.lixin.guava;

import cn.hutool.core.io.FileUtil;
import com.google.common.io.Files;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * 文件操作
 */
public class FilesTest {

    @Test
    @DisplayName("testFileTouch")
    public void testTouchFile() throws IOException {
        File touchFile = new File("C:\\Users\\hello.txt");
        touchFile.deleteOnExit();
        FileUtil.touch(touchFile);
        Files.touch(touchFile);
        assertThat(touchFile.exists(), equalTo(true));
    }
}
