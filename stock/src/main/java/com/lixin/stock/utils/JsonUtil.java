package com.lixin.stock.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.lang3.StringUtils;


import java.io.IOException;

/**
 * json的封装类
 */
public class JsonUtil {

    public static ObjectMapper objectMapper;

    static {
        objectMapper = new ObjectMapper();
     
        //Setting the FAIL_ON_EMPTY_BEANS attribute. Do not throw an exception when a serialized object is empty.
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        
        //Setting the FAIL_ON_UNKNOWN_PROPERTIES attribute.
        //When the string JSON character contains attributes that do not exist in the Java object, ignore them.
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    /**
     * Convert Object to JsonString
     * 
     * @param jsonObj
     * @return
     */
    public static String jsonObj2Sting(Object jsonObj) {
        String jsonString = null;

        try {
            jsonString = objectMapper.writeValueAsString(jsonObj);
        } catch (IOException e) {
            System.out.printf("pasre json Object[{}] to string failed.",jsonString);
        }

        return jsonString;
    }

    /**
     * Convert JsonString to Simple Object
     * 
     * @param jsonString
     * @param cls
     * @return
     */
    public static <T> T jsonString2SimpleObj(String jsonString, Class<T> cls) {
        T jsonObj = null;

        try {
            jsonObj = objectMapper.readValue(jsonString, cls);
        } catch (IOException e) {
        	System.out.printf("pasre json Object[{}] to string failed.",jsonString);
        }

        return jsonObj;
    }
   
    /**
     * Method that will convert object to the ObjectNode.
     *
     * @param value
     *            the source data; if null, will return null.
     * @return the ObjectNode data after converted.
     * @throws JsonException
     */
    public static <T> ObjectNode convertObject2ObjectNode(T object)
            throws Exception {
        if (null == object) {
            return null;
        }

        ObjectNode objectNode = null;

        if (object instanceof String) {
            objectNode = convertJsonStringToObject((String) object,
                    ObjectNode.class);
        } else {
            objectNode = convertValue(object, ObjectNode.class);
        }

        return objectNode;
    }
    

    public static <T> T convertJsonStringToObject(String jsonString,
            Class<T> cls)  {
        if (StringUtils.isBlank(jsonString)) {
            return null;
        }

        try {
            T object = objectMapper.readValue(jsonString, cls);
            return object;
        } catch (Exception e) {
            return null;
        }
    }
    

    private static <T> T convertValue(Object fromValue, Class<T> toValueType)
            throws Exception {
        try {
            return objectMapper.convertValue(fromValue, toValueType);
        } catch (IllegalArgumentException e) {
            throw new Exception(e);
        }
    }
}
