package com.lixin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lixin.entity.SimStockInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SimStockInfoDao extends BaseMapper<SimStockInfo> {
}
