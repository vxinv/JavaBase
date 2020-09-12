package com.lixin.stock.mapper;

import com.lixin.stock.model.StockNcode;
import com.lixin.stock.model.StockNcodeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockNcodeMapper {
    long countByExample(StockNcodeExample example);

    int deleteByExample(StockNcodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StockNcode record);

    int insertSelective(StockNcode record);

    List<StockNcode> selectByExample(StockNcodeExample example);

    StockNcode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StockNcode record, @Param("example") StockNcodeExample example);

    int updateByExample(@Param("record") StockNcode record, @Param("example") StockNcodeExample example);

    int updateByPrimaryKeySelective(StockNcode record);

    int updateByPrimaryKey(StockNcode record);
}