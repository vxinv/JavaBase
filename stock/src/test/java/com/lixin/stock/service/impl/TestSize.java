package com.lixin.stock.service.impl;

import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;

import java.util.Random;

public class TestSize {
    public static void main(String[] args) {
        Random random = new Random();
        float[][] floats = new float[6000000][20];
        for (int i = 0; i < floats.length; i++) {
            float[] aFloat = floats[i];
            for (int i1 = 0, aFloatLength = aFloat.length; i1 < aFloatLength; i1++) {
                float v = aFloat[i1];
                floats[i][i1] = random.nextFloat() * 1000000;
            }
        }
        long objectSize = ObjectSizeCalculator.getObjectSize(floats);
        System.out.println(floats[123][5]);
        System.out.println(objectSize/1024/1024);
    }
}
