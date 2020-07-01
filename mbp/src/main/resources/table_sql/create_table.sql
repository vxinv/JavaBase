# 商品详情
drop table if exists lixintest.goods;
create table lixintest.goods(
                    id                    int       not null auto_increment primary key ,
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
);

# 订单
create table lixintest.orders(
       id             int       not null auto_increment primary key  ,
       order_sn       varchar(32)   not null comment '订单序列号',
       user_id        int(12)       not null comment '用户id',
       order_status   smallint      not null comment '//1xx 表示订单取消和删除等状态 0订单创建成功等待付款，
                                                    　101订单已取消，　102订单已删除
                                                      //2xx 表示订单支付状态
                                                    　201订单已付款，等待发货
                                                      //3xx 表示订单物流相关状态　300订单已发货， 301用户确认收货
                                                      //4xx 表示订单退换货相关的状态
                                                    　401 没有发货，退款　402 已收货，退款退货',
       shiping_status tinyint       not null comment '//发货状态 商品配送情况;0未发货,1已发货,2已收货,4退货',
       pay_status  tinyint  not null comment '//付款状态 支付状态;0未付款;1付款中;2已付款',
       consignee  varchar(32) not null    comment   '收货人',
       province   varchar(32) not null    comment   '省',
       city       varchar(32) not null    comment     '地市',
       district   varchar(32) not null    comment     '区县',
       address    varchar(64) not null    comment     '收货地址',
       mobile     varchar(18) not null    comment     '联系电话',
       postscript varchar(128) not null   comment     '备注'



)
# 用户

# 付款