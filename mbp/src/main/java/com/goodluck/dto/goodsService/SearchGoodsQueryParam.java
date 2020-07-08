package com.goodluck.dto.goodsService;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class SearchGoodsQueryParam {

    // 某个店铺
    Integer ShopId;

    //某个分类
    Short classify1;

    //某个分类
    Short classify2;

    //某个分类
    Short classify3;

    // 促销
    Integer recommandStatus;

    // 当前页数
    Integer pageNo = 1;

    // 页面大小
    Integer pageSize = 10;


}
