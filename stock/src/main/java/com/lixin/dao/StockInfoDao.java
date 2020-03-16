package com.lixin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lixin.entity.StockInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StockInfoDao extends BaseMapper<StockInfo> {

    /*获取当天涨停的股票*/

}
