drop table  if exists stock_code;
create table stock_code(
                           id                     int primary key auto_increment comment 'id',
                           company_name           varchar(12) not null comment '公司名称',
                           stock_code             varchar(12) not null comment '股票代码',
                           total_shares           bigint comment '总股本',
                           total_assets           bigint comment '总资产',
                           gross_profit_margin    float comment '销售毛利率',
                           roe                    float comment '净资产收益率',
                           earnings_per_share     float comment '每股收益',
                           net_asset_per_share    float comment '每股净资产',
                           cash_flow_per_share    float comment '每股现金流',
                           float_market_capital   bigint comment '流通值',
                           float_shares           bigint comment '流通股(元)',
                           total_operating_income bigint comment '营业总收入(元)',
                           net_profit_cagr        double comment '净利润',
                           one_category_id        int comment '一级分类id',
                           one_category           varchar(10) comment '名称',
                           two_category_id        int comment '二级分类id',
                           two_category           varchar(10) comment '名称',
                           three_category_id      int comment '三级分类',
                           three_category         varchar(10) comment '名称'


);

drop table if exists stock.stock_data;
create table stock.stock_data
(
    id            int primary key auto_increment,
    code          varchar(8) comment '代码',
    time          datetime default now() comment '日期',
    open_price    decimal(10, 2) comment '开盘价',
    close_price   decimal(10, 2) comment '收盘价',
    range_price   decimal(10, 2) comment '价格浮动',
    range_rate    float comment '价格浮动率',
    lowest_price  decimal(10, 2) comment '最低价格',
    highest_price decimal(10, 2) comment '最高价格',
    trade_volume  bigint comment '交易量(手)',
    trade_money   float comment '交易金额',
    turnover_rate decimal(10, 2) comment '周转率'

);

drop table if exists stock.industry_simple;

create table stock.industry_simple
(
    id          int primary key auto_increment,
    plate       varchar(12),
    first_name  varchar(5),
    second_name varchar(5),
    level2code  varchar(10),
    titie       varchar(10)
)
