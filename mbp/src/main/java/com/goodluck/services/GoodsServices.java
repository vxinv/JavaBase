package com.goodluck.services;


import com.goodluck.dto.goodsService.SearchGoodsQueryParam;
import com.goodluck.model.Goods;

import java.util.List;

public interface GoodsServices {

    /**
     * 添加goods
     */
    Integer addGoods(Goods goods);

    /**
     * 查询goods 分类
     */
    List<Goods> searchGoods(SearchGoodsQueryParam searchGoodsQueryParam);

}
