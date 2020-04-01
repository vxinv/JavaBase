package com.lixin.controller.testDynamicDataSource;

import com.lixin.model.Product;
import com.lixin.services.dynamicDataSource.DynamicDataSourceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestDynamicDataSourceController {

    @Resource
    private DynamicDataSourceService productService;

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") Long productId) {
        return productService.select(productId);
    }

    @GetMapping("/ins")
    public Integer  addProduct(){
        return productService.insert();
    }
}
