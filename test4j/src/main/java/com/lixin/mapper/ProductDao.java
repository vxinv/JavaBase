package com.lixin.mapper;

import com.lixin.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ProductDao {

    Product select(@Param("id") long id);

    Integer insert(Product product);

}
