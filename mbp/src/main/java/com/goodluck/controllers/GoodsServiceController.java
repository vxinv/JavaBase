package com.goodluck.controllers;

import com.lixin.testweb.api.CommonPage;
import com.lixin.testweb.api.CommonResult;
import com.goodluck.dto.goodsService.SearchGoodsQueryParam;
import com.goodluck.model.Goods;
import com.goodluck.services.GoodsServices;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods")
@Api(tags = "GoodsServiceController", description = "商品管理")
public class GoodsServiceController  {

    @Autowired
    GoodsServices goodsServices;

    public CommonResult<Integer> addGoods(Goods goods) {
        return null;
    }

    @ApiOperation("按条件查询商品")
    @PostMapping("/searchGoods")
    public CommonResult<CommonPage<Goods>> searchGoods(@RequestBody SearchGoodsQueryParam searchGoodsQueryParam) {
        List<Goods> goods = goodsServices.searchGoods(searchGoodsQueryParam);
        return CommonResult.success(CommonPage.restPage(goods));
    }
}
