package com.lixin.stock.mapper;

import com.lixin.stock.model.IndustrySimple;
import com.lixin.stock.model.IndustrySimpleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IndustrySimpleMapper {
    long countByExample(IndustrySimpleExample example);

    int deleteByExample(IndustrySimpleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IndustrySimple record);

    int insertSelective(IndustrySimple record);

    List<IndustrySimple> selectByExample(IndustrySimpleExample example);

    IndustrySimple selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IndustrySimple record, @Param("example") IndustrySimpleExample example);

    int updateByExample(@Param("record") IndustrySimple record, @Param("example") IndustrySimpleExample example);

    int updateByPrimaryKeySelective(IndustrySimple record);

    int updateByPrimaryKey(IndustrySimple record);
}