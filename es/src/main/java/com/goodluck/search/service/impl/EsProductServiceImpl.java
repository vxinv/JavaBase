package com.goodluck.search.service.impl;

import com.goodluck.search.model.Goods;
import com.goodluck.search.domain.EsGoods;
import com.goodluck.search.mapper.GoodsMapper;
import com.goodluck.search.nosql.es.EsProductRepository;
import com.goodluck.search.service.EsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EsProductServiceImpl implements EsProductService {

    @Autowired
    GoodsMapper goodsMapper;

    @Autowired
    EsProductRepository  esProductRepository;

    @Override
    public int importAll() {
        List<Goods> goods = goodsMapper.selectByExample(null);

        Iterable<Goods> iterable = esProductRepository.saveAll(goods);
        int result = 0;
        for (Goods g : iterable) {
            result++;
        }
        return result;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public EsGoods create(Long id) {
        return null;
    }

    @Override
    public void delete(List<Long> ids) {

    }

    @Override
    public Page<Goods> search(String keyword, Integer pageNum, Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNum, pageSize);
        return esProductRepository.findByNameOrSubTitleOrKeywords(keyword,keyword,keyword,pageRequest);
    }
}
