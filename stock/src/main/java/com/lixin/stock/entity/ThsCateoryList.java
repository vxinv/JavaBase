package com.lixin.stock.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ThsCateoryList {
    List<List<String>> data;
}
