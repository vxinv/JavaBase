package com.goodluck.services.impl;

import com.github.pagehelper.PageHelper;
import com.goodluck.dto.goodsService.SearchGoodsQueryParam;
import com.goodluck.mapper.GoodsMapper;
import com.goodluck.model.Goods;
import com.goodluck.model.GoodsExample;
import com.goodluck.services.GoodsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsServices {

    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public Integer addGoods(Goods goods) {
       return goodsMapper.insertSelective(goods);
    }

    @Override
    public List<Goods> searchGoods(SearchGoodsQueryParam searchGoodsQueryParam) {

        PageHelper.startPage(searchGoodsQueryParam.getPageNo(),searchGoodsQueryParam.getPageSize());

        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andClassify1EqualTo(searchGoodsQueryParam.getClassify1());
        criteria.andClassify2EqualTo(searchGoodsQueryParam.getClassify2());

        if (searchGoodsQueryParam.getClassify3()!=null){
            criteria.andClassify3EqualTo(searchGoodsQueryParam.getClassify3());
        }
        if (searchGoodsQueryParam.getRecommandStatus()!= null){
            criteria.andRecommandStatusEqualTo(searchGoodsQueryParam.getRecommandStatus());
        }
        if (searchGoodsQueryParam.getShopId()!=null){
            criteria.andShopIdEqualTo(searchGoodsQueryParam.getShopId());
        }

        return goodsMapper.selectByExample(goodsExample);
    }
}
