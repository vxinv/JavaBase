# 商品详情
drop table if exists lixintest.goods;
create table lixintest.goods(
       id                    int           not null auto_increment primary key ,
       goods_id              int(12)       not null comment '商品id',
       shop_id               int           not null comment '商铺id',
       shop_name             varchar(255)  not null comment '商铺名字',
       classify1             smallint      not null comment '分级1',
       classify2             smallint      not null comment '分级2',
       classify3             smallint      not null comment '分级3',
       purchase_price        decimal(16,2) not null comment '进价',
       brand_id              bigint comment '品牌id',
       product_category_id   bigint comment '品牌分类id',
       feight_template_id    bigint comment '运费模版id',
       product_attribute_category_id bigint comment '品牌属性分类id',
       name                  varchar(64) not null comment '商品名称',
       pic                   varchar(255) comment '图片',
       product_sn            varchar(64) not null comment '货号',
       delete_status         int(1) comment '删除状态：0->未删除；1->已删除',
       publish_status        int(1) comment '上架状态：0->下架；1->上架',
       new_status            int(1) comment '新品状态:0->不是新品；1->新品',
       recommand_status      int(1) comment '推荐状态；0->不推荐；1->推荐',
       verify_status         int(1) comment '审核状态：0->未审核；1->审核通过',
       sort                  int comment '排序',
       sale                  int comment '销量',
       price                 decimal(10,2) comment '价格',
       promotion_price       decimal(10,2) comment '促销价格',
       gift_growth           int default 0 comment '赠送的成长值',
       gift_point            int default 0 comment '赠送的积分',
       use_point_limit       int comment '限制使用的积分数',
       sub_title             varchar(255) comment '副标题',
       description           text comment '商品描述',
       original_price        decimal(10,2) comment '市场价',
       stock                 int comment '库存',
       low_stock             int comment '库存预警值',
       unit                  varchar(16) comment '单位',
       weight                decimal(10,2) comment '商品重量，默认为克',
       preview_status        int(1) comment '是否为预告商品：0->不是；1->是',
       service_ids           varchar(64) comment '以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮',
       keywords              varchar(255) comment '关键字',
       note                  varchar(255) comment '备注',
       album_pics            text comment '画册图片，连产品图片限制为5张，以逗号分割',
       detail_title          varchar(255) comment '详情标题',
       detail_desc           text comment '详情描述',
       detail_html           text comment '产品详情网页内容',
       detail_mobile_html    text comment '移动端网页详情',
       promotion_start_time  datetime comment '促销开始时间',
       promotion_end_time    datetime comment '促销结束时间',
       promotion_per_limit   int comment '活动限购数量',
       promotion_type        int(1) comment '促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购',
       product_category_name varchar(255) comment '产品分类名称',
       brand_name            varchar(255) comment '品牌名称'
);