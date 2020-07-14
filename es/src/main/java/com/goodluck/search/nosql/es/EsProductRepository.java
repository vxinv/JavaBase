package com.goodluck.search.nosql.es;

import com.goodluck.search.model.Goods;
import com.goodluck.search.domain.EsGoods;
import org.springframework.boot.actuate.autoconfigure.metrics.export.elastic.ElasticProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface EsProductRepository extends ElasticsearchRepository<Goods,Long> {

    /**
     *
     * @param name  名字
     * @param subTitle 副标题
     * @param keyWord  关键字
     * @return
     */
    Page<Goods>  findByNameOrSubTitleOrKeywords(String name, String subTitle, String keyWord, Pageable pageable);
}
