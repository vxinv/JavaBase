package com.lixin.stock.mapper;

import com.lixin.stock.model.StockDfcfFundFlowInfo;
import com.lixin.stock.model.StockDfcfFundFlowInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDfcfFundFlowInfoMapper {
    long countByExample(StockDfcfFundFlowInfoExample example);

    int deleteByExample(StockDfcfFundFlowInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StockDfcfFundFlowInfo record);

    int insertSelective(StockDfcfFundFlowInfo record);

    List<StockDfcfFundFlowInfo> selectByExampleWithBLOBs(StockDfcfFundFlowInfoExample example);

    List<StockDfcfFundFlowInfo> selectByExample(StockDfcfFundFlowInfoExample example);

    StockDfcfFundFlowInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StockDfcfFundFlowInfo record, @Param("example") StockDfcfFundFlowInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") StockDfcfFundFlowInfo record, @Param("example") StockDfcfFundFlowInfoExample example);

    int updateByExample(@Param("record") StockDfcfFundFlowInfo record, @Param("example") StockDfcfFundFlowInfoExample example);

    int updateByPrimaryKeySelective(StockDfcfFundFlowInfo record);

    int updateByPrimaryKeyWithBLOBs(StockDfcfFundFlowInfo record);

    int updateByPrimaryKey(StockDfcfFundFlowInfo record);
}
