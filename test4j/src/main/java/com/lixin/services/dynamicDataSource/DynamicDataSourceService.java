package com.lixin.services.dynamicDataSource;

import com.lixin.machDataSource.TargetDataSource;
import com.lixin.mapper.ProductDao;
import com.lixin.model.Product;
import org.aspectj.lang.annotation.After;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DynamicDataSourceService {

    @Autowired
    ProductDao productDao;

    Logger log = LoggerFactory.getLogger(this.getClass());

    @TargetDataSource("slave")
    public Product select(long productId)  {
        Product product = productDao.select(productId);
        if (product == null) {
            log.error("Product:" + productId + " not found");
        }
        return product;
    }

    @TargetDataSource("master")
    public Integer insert(){
        Product product = new Product();
        product.setName("lixin");
        product.setPrice(10000);
        Integer insert = productDao.insert(product);
        return insert;
    }

}
