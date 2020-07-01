package com.goodluck.controllers;

import com.goodluck.dto.goodsService.SearchGoodsQueryParam;
import com.goodluck.model.Goods;
import com.goodluck.services.GoodsServices;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsServiceController  {


    public Integer addGoods(Goods goods) {
        return null;
    }


    public List<Goods> searchGoods(SearchGoodsQueryParam searchGoodsQueryParam) {
        return null;
    }
}
