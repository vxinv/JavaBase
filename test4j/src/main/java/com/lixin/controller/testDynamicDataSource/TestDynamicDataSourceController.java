/*
package com.lixin.controller.testDynamicDataSource;

import com.lixin.github.vxinv.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDynamicDataSourceController {


    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") Long productId) {
        return productService.select(productId);
    }

    @GetMapping("/ins")
    public Integer addProduct() {
        return productService.insert();
    }
}
*/
