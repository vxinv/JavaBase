drop table  if exists stock_code;
create table stock_code (
    id int primary key  auto_increment comment 'id',
    company_name     varchar(12)  not null  comment '公司名称',
    stock_code    varchar(12)  not null  comment '股票代码',
    industry  varchar(12) not null  comment '所属行业'

);

drop table if exists stock.stock_data;
create table stock.stock_data (
    id int primary key auto_increment,
    code varchar(8)  comment '代码',
    time datetime default now()   comment '日期',
    open_price decimal(10,2) comment '开盘价',
    close_price  decimal(10,2) comment '收盘价',
    range_price decimal(10,2) comment '价格浮动',
    range_rate float comment '价格浮动率',
    lowest_price decimal(10,2) comment  '最低价格',
    highest_price decimal(10,2) comment '最高价格',
    trade_volume bigint comment '交易量(手)',
    trade_money float comment '交易金额',
    turnover_rate decimal(10,2) comment '周转率'
)

