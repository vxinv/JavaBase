package com.lixin.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * stock_info
 * @author 
 */
@Data
@TableName("stock_info")

public class StockInfo implements Serializable {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    private String code;
    private Date rtime;
    private Float openPrice;
    private Float closePrice;
    private Float rangePrice;
    private Float rangeRate;/*涨幅*/
    private Float lowestPrice;
    private Float hightestPrice;
    private Integer tradeVolume;/*交易量*/
    private Integer tradeMoney; /*交易额*/
    private Float turnoverRate;/*换手率*/
    private static final long serialVersionUID = 1L;



}