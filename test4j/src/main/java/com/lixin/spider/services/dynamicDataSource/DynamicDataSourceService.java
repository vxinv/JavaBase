package com.lixin.spider.services.dynamicDataSource;

import com.lixin.machDataSource.TargetDataSource;
import com.lixin.mapper.ProductDao;
import com.lixin.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DynamicDataSourceService {

    @Autowired
    ProductDao productDao;

    Logger log = LoggerFactory.getLogger(this.getClass());

    @TargetDataSource("slave")
    public Product select(long productId)  {
        log.info("当前查询线程[{}]",Thread.currentThread().getName());
        Product product = productDao.select(productId);
        if (product == null) {
            log.error("Product:" + productId + " not found");
        }
        return product;
    }

    @TargetDataSource("master")
    @Transactional(isolation = Isolation.READ_UNCOMMITTED)
    public Integer insert(){
        Product product = new Product();
        product.setName("lixin");
        product.setPrice(10000);
        Integer insert = productDao.insert(product);
        return insert;
    }

}
