package com.goodluck.etf.entity;

import lombok.Data;

import java.util.List;

@Data
public class RealTimeInfoVo {
    private List<RealTimeData> data;
    private int error_code;
}
