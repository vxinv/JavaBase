package com.lixin.guava.ReflectionTest;


import com.google.common.reflect.TypeToken;
import junit.framework.TestCase;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;



public class ReflectionDemo1  extends TestCase {

    private abstract static class StringList implements List<String> {}

    private abstract static class IntegerList implements List<Integer> {}

    public void testValueEqualityNotInstanceEquality() {
        TypeToken<List<String>> a = new TypeToken<List<String>>() {};
        TypeToken<List<String>> b = new TypeToken<List<String>>() {};
        System.out.println(a.equals(b));
    }

    public <T> void testVariableTypeTokenNotAllowed() {
        try {
            new TypeToken<T>() {};
            fail();
        } catch (IllegalStateException expected) {
        }
    }

    public void testRawTypeIsCorrect() {
        TypeToken<List<String>> token = new TypeToken<List<String>>() {};
        assertEquals(List.class, token.getRawType());
    }

    public void testClass(){
        List<String> list = new ArrayList<String>(){};
        Type superclass = list.getClass().getGenericSuperclass();
        ParameterizedType parameterized = (ParameterizedType) superclass;
        Type raw = parameterized.getRawType();  // ArrayList类
        System.out.println(raw.getTypeName());
        Type[] types = parameterized.getActualTypeArguments();  // String类
        for (Type type : types) {
            System.out.println(type.getTypeName());
        }

    }

    public void  testTypeToken(){
        //use an empty anonymous inner class
        TypeToken<List<String>> typeToken = new TypeToken<List<String>>() {};
        // Returns the wrapped java.lang.reflect.Type.
        System.out.println(typeToken.getType().getTypeName());
        // get most-known runtime class
        System.out.println(typeToken.getRawType().getSimpleName());
        // Returns some subtype of this that has the specified raw class. For example,
        // if this is Iterable<String> and the argument is List.class, the result will be List<String>.
        System.out.println(typeToken.getTypes());
    }








}
