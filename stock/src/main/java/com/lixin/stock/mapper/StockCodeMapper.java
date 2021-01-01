package com.lixin.stock.mapper;

import com.lixin.stock.model.StockCode;
import com.lixin.stock.model.StockCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockCodeMapper {
    long countByExample(StockCodeExample example);

    int deleteByExample(StockCodeExample example);

    int insert(StockCode record);

    int insertSelective(StockCode record);

    List<StockCode> selectByExample(StockCodeExample example);

    int updateByExampleSelective(@Param("record") StockCode record, @Param("example") StockCodeExample example);

    int updateByExample(@Param("record") StockCode record, @Param("example") StockCodeExample example);
}