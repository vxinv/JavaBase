package com.lixin.stock.mapper;

import com.lixin.stock.model.StockData;
import com.lixin.stock.model.StockDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockDataMapper {
    long countByExample(StockDataExample example);

    int deleteByExample(StockDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StockData record);

    int insertSelective(StockData record);

    List<StockData> selectByExample(StockDataExample example);

    StockData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StockData record, @Param("example") StockDataExample example);

    int updateByExample(@Param("record") StockData record, @Param("example") StockDataExample example);

    int updateByPrimaryKeySelective(StockData record);

    int updateByPrimaryKey(StockData record);
}