package com.lixin.stock.mapper;

import com.lixin.stock.model.IndustrySimple;
import com.lixin.stock.model.IndustrySimpleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndustrySimpleMapper {
    long countByExample(IndustrySimpleExample example);

    int deleteByExample(IndustrySimpleExample example);

    int insert(IndustrySimple record);

    int insertSelective(IndustrySimple record);

    List<IndustrySimple> selectByExample(IndustrySimpleExample example);

    int updateByExampleSelective(@Param("record") IndustrySimple record, @Param("example") IndustrySimpleExample example);

    int updateByExample(@Param("record") IndustrySimple record, @Param("example") IndustrySimpleExample example);
}