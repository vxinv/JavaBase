package com.lixin.stock.mapper;

import com.lixin.stock.model.StockThsGnInfo;
import com.lixin.stock.model.StockThsGnInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockThsGnInfoMapper {
    long countByExample(StockThsGnInfoExample example);

    int deleteByExample(StockThsGnInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StockThsGnInfo record);

    int insertSelective(StockThsGnInfo record);

    List<StockThsGnInfo> selectByExampleWithBLOBs(StockThsGnInfoExample example);

    List<StockThsGnInfo> selectByExample(StockThsGnInfoExample example);

    StockThsGnInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StockThsGnInfo record, @Param("example") StockThsGnInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") StockThsGnInfo record, @Param("example") StockThsGnInfoExample example);

    int updateByExample(@Param("record") StockThsGnInfo record, @Param("example") StockThsGnInfoExample example);

    int updateByPrimaryKeySelective(StockThsGnInfo record);

    int updateByPrimaryKeyWithBLOBs(StockThsGnInfo record);

    int updateByPrimaryKey(StockThsGnInfo record);
}
