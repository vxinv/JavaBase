package com.lixin.java8;

import com.qiniu.util.Auth;

public class TestQiniu {
    public static void main(String[] args) {
        String accessKey = "'qEjtRsk220SrirJdrxY6UxBpFW-sbRaLOGzscjT1'";
        String secretKey = "'qEjtRsk220SrirJdrxY6UxBpFW-sbRaLOGzscjT1'";

        String bucket = "myone";
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);
        System.out.println(upToken);
    }
}
