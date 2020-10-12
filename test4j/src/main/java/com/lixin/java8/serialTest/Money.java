package com.lixin.java8.serialTest;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Money implements Serializable {

    private static final long serialVersionUID = -5809782578272943999L;

    int value;

    public Money(int value) {
        this.value = value;
    }

    public void cost(int n) {
        int m = value - n;
        System.out.println("本次花费了" + n + "元" + "剩余" + m + "元");
    }
}
