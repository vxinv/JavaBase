package com.goodluck.search.domain;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.elasticsearch.index.engine.Engine;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 搜索中的商品信息
 * 对商品名称 货号  关键字   副标题
 * 导入 es 进行关键字查询
 */
@Data
@Document(indexName = "pms",type = "product",shards = 1,replicas = 0)
public class EsGoods {




}
