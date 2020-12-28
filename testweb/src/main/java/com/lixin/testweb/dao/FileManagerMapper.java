package com.lixin.testweb.dao;

import com.lixin.testweb.model.FileManager;
import com.lixin.testweb.model.FileManagerExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface FileManagerMapper {
    long countByExample(FileManagerExample example);

    int deleteByExample(FileManagerExample example);

    int deleteByPrimaryKey(Integer fileId);

    int insert(FileManager record);

    int insertSelective(FileManager record);

    List<FileManager> selectByExample(FileManagerExample example);

    FileManager selectByPrimaryKey(Integer fileId);

    int updateByExampleSelective(@Param("record") FileManager record, @Param("example") FileManagerExample example);

    int updateByExample(@Param("record") FileManager record, @Param("example") FileManagerExample example);

    int updateByPrimaryKeySelective(FileManager record);

    int updateByPrimaryKey(FileManager record);
}