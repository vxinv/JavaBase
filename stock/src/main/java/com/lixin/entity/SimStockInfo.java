package com.lixin.entity;

/*简略股票信息*/

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("sim_stock_info")
public class SimStockInfo {

    @TableId(value = "id",type = IdType.AUTO)
    int id;
    String code;
    String industry;
    String comName;

}
