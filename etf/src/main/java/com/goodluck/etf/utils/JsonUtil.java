package com.goodluck.etf.utils;

import cn.hutool.core.exceptions.ExceptionUtil;
import cn.hutool.core.util.StrUtil;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class JsonUtil {
    private static final Logger log = LoggerFactory.getLogger(JsonUtil.class);
    public static ObjectMapper objectMapper = new ObjectMapper();

    static {
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public JsonUtil() {
    }

    public static String jsonObj2Sting(Object jsonObj) {
        String jsonString = null;

        try {
            jsonString = objectMapper.writeValueAsString(jsonObj);
        } catch (IOException var3) {
            System.out.printf("pasre json Object[{}] to string failed.", jsonString);
        }

        return jsonString;
    }

    public static <T> T jsonString2SimpleObj(String jsonString, Class<T> cls) {
        T jsonObj = null;

        try {
            jsonObj = objectMapper.readValue(jsonString, cls);
        } catch (IOException var4) {
            System.out.printf("pasre json Object[{}] to string failed.", jsonString);
        }

        return jsonObj;
    }

    public static <T> ObjectNode convertObject2ObjectNode(T object) throws Exception {
        if (null == object) {
            return null;
        } else {
            ObjectNode objectNode = null;
            if (object instanceof String) {
                objectNode = convertJsonStringToObject((String) object, ObjectNode.class);
            } else {
                objectNode = convertValue(object, ObjectNode.class);
            }

            return objectNode;
        }
    }

    public static <T> T convertJsonStringToObject(String jsonString, Class<T> cls) {
        if (StrUtil.isBlank(jsonString)) {
            return null;
        } else {
            try {
                T object = objectMapper.readValue(jsonString, cls);
                return object;
            } catch (Exception var3) {
                log.error(ExceptionUtil.stacktraceToString(var3));
                return null;
            }
        }
    }

    private static <T> T convertValue(Object fromValue, Class<T> toValueType) throws Exception {
        try {
            return objectMapper.convertValue(fromValue, toValueType);
        } catch (IllegalArgumentException var3) {
            throw new Exception(var3);
        }
    }
}
