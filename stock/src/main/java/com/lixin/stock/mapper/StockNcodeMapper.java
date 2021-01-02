package com.lixin.stock.mapper;

import com.lixin.stock.model.StockNcode;
import com.lixin.stock.model.StockNcodeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface StockNcodeMapper {
    long countByExample(StockNcodeExample example);

    int deleteByExample(StockNcodeExample example);

    int insert(StockNcode record);

    int insertSelective(StockNcode record);

    List<StockNcode> selectByExample(StockNcodeExample example);

    int updateByExampleSelective(@Param("record") StockNcode record, @Param("example") StockNcodeExample example);

    int updateByExample(@Param("record") StockNcode record, @Param("example") StockNcodeExample example);
}