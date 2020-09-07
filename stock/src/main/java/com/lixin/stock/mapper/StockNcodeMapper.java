package com.lixin.stock.mapper;

import com.lixin.stock.model.StockCode;
import com.lixin.stock.model.StockCodeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockNcodeMapper {
    long countByExample(StockCodeExample example);

    int deleteByExample(StockCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StockCode record);

    int insertSelective(StockCode record);

    List<StockCode> selectByExample(StockCodeExample example);

    StockCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StockCode record, @Param("example") StockCodeExample example);

    int updateByExample(@Param("record") StockCode record, @Param("example") StockCodeExample example);

    int updateByPrimaryKeySelective(StockCode record);

    int updateByPrimaryKey(StockCode record);
}