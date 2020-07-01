package com.goodluck.dto.goodsService;


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

    public SearchGoodsQueryParam() {
    }

    public Integer getShopId() {
        return ShopId;
    }

    public void setShopId(Integer shopId) {
        ShopId = shopId;
    }

    public Short getClassify1() {
        return classify1;
    }

    public void setClassify1(Short classify1) {
        this.classify1 = classify1;
    }

    public Short getClassify2() {
        return classify2;
    }

    public void setClassify2(Short classify2) {
        this.classify2 = classify2;
    }

    public Short getClassify3() {
        return classify3;
    }

    public void setClassify3(Short classify3) {
        this.classify3 = classify3;
    }

    public Integer getRecommandStatus() {
        return recommandStatus;
    }

    public void setRecommandStatus(Integer recommandStatus) {
        this.recommandStatus = recommandStatus;
    }

    @Override
    public String toString() {
        return "SearchGoodsQueryParam{" +
                "ShopId=" + ShopId +
                ", classify1=" + classify1 +
                ", classify2=" + classify2 +
                ", classify3=" + classify3 +
                ", recommandStatus=" + recommandStatus +
                '}';
    }
}
