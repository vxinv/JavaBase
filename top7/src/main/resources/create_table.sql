# 商品详情
drop table if exists lixin.goods;
create table lixin.goods(
                    id                    int(12)       not null auto_increment primary key ,
                    goods_id              int(12)       not null comment '商品id',
                    classify1             smallint      not null comment '分级1',
                    classify2             smallint      not null comment '分级2',
                    classify3             smallint      not null comment '分级3',
                    goods_desc            varchar(256)  not null comment '商品描述',
                    goods_name            varchar(128)  not null comment '商品名称',
                    sell_price            decimal(16,2) not null comment '销售价格',
                    purchase_price        decimal(16,2) not null comment '进价',
                    goods_thumbnail       varchar(256)  not null comment '缩略图',
                    inventory             int(12)       not null comment '库存'
)

# 订单


