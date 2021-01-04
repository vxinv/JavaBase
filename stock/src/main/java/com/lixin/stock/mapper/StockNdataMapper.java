package com.lixin.stock.mapper;

import com.lixin.stock.model.StockNdata;
import com.lixin.stock.model.StockNdataExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockNdataMapper {
    long countByExample(StockNdataExample example);

    int deleteByExample(StockNdataExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StockNdata record);

    int insertSelective(StockNdata record);

    List<StockNdata> selectByExample(StockNdataExample example);

    StockNdata selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StockNdata record, @Param("example") StockNdataExample example);

    int updateByExample(@Param("record") StockNdata record, @Param("example") StockNdataExample example);

    int updateByPrimaryKeySelective(StockNdata record);

    int updateByPrimaryKey(StockNdata record);
}
