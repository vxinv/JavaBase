package com.goodluck.services.impl;

import com.goodluck.Application;
import com.goodluck.dto.goodsService.SearchGoodsQueryParam;
import com.goodluck.mock.MockData;
import com.goodluck.model.Goods;
import com.goodluck.services.GoodsServices;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class) //AccountPlatApplication 为启动类
public class GoodsServiceImplTest {


    @Autowired
    GoodsServices goodsServices;
    @Test
    public void addGoods() {
        Goods goods = new Goods();
        Random random = new Random();
        int n = MockData.names.length;
        int p = MockData.pics.length;
        for (int i = 0; i < 1000; i++) {
            goods.setGoodsId(i);
            goods.setShopId(1);
            goods.setShopName("自营");
            goods.setClassify1((short) random.nextInt(8));
            goods.setClassify2((short) random.nextInt(8));
            goods.setClassify3((short) random.nextInt(8));
            goods.setPurchasePrice(BigDecimal.valueOf(Math.random()*100));
            goods.setBrandId((long) random.nextInt(10));
            goods.setProductCategoryId((long) random.nextInt(10));
            goods.setFeightTemplateId((long) random.nextInt(10));
            goods.setProductAttributeCategoryId((long) random.nextInt(10));
            goods.setName(MockData.names[i%n]);
            goods.setPic(MockData.pics[i%p]);
            goods.setProductSn(UUID.randomUUID().toString());
            goods.setDeleteStatus(0);
            goods.setPublishStatus(1);
            goods.setRecommandStatus(1);
            goods.setSort(i%100);
            goods.setSale(random.nextInt(10000000));
            goods.setPrice(BigDecimal.valueOf(random.nextInt(100000)/100));
            goods.setPromotionPrice(BigDecimal.valueOf(random.nextInt(100000)/100));
            goods.setGiftGrowth(random.nextInt(1000));
            goods.setGiftGrowth(random.nextInt(1000));
            goods.setUsePointLimit(1000);
            goods.setSubTitle(MockData.names[i%n]);
            goods.setDescription(MockData.names[i%n]);
            goods.setOriginalPrice(BigDecimal.valueOf(random.nextInt(100000)/100));
            goods.setStock(random.nextInt(100000));
            goods.setStock(10);
            goods.setUnit("份");
            goods.setWeight(BigDecimal.valueOf(500L));
            goods.setPreviewStatus(0);
            goods.setKeywords(MockData.names[i%n]);
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < 4; j++) {
                if (j==3){
                    stringBuilder.append(MockData.pics[random.nextInt(100)%p]);
                }
                stringBuilder.append(MockData.pics[random.nextInt(100)%p]).append(",");
            }

            goods.setAlbumPics(stringBuilder.toString());
            goods.setDetailDesc(MockData.names[i%n]);
            goods.setPromotionStartTime(new Date());
            goods.setPromotionEndTime(new Date());
            goods.setPromotionType(0);
            goods.setBrandName("自营");

            goodsServices.addGoods(goods);
        }

    }

    @Test
    public void searchGoods() {
        SearchGoodsQueryParam searchGoodsQueryParam = new SearchGoodsQueryParam();
        searchGoodsQueryParam.setClassify1((short) 2);
        searchGoodsQueryParam.setClassify2((short) 5);
        List<Goods> goods = goodsServices.searchGoods(searchGoodsQueryParam);
        System.out.println(goods);
    }

    @Test
    public void testBase(){
        System.out.println(MockData.pics.length);
        int size = MockData.pics.length;
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int k = random.nextInt(size);
            System.out.println(k + MockData.pics[k]);
        }
    }
}