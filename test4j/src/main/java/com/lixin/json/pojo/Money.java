package com.lixin.json.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Money {
    int value;

    public Money(int value) {
        this.value = value;
    }

    public void cost(int n){
        int m = value - n;
        System.out.println("本次花费了" + n + "元" + "剩余"+ m +"元");
    }
}
