

drop table if exists stock_ncode;
create table stock_ncode
(
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





drop table if exists stock.stock_ndata;
create table stock.stock_ndata
(
    id             bigint primary key auto_increment,
    code           varchar(10) comment '代码',
    timestamp      datetime comment '日期',
    volume         bigint comment '当天成交量',
    open           decimal(10, 2) comment '当天开盘价',
    high           decimal(10, 2) comment '当天最高价',
    low            decimal(10, 2) comment '当天最低价',
    close          decimal(10, 2) comment '当天收盘价',
    chg            float comment '涨跌额',
    percent        float comment '涨跌幅',
    turnoverrate   float comment '换手率(%)',
    amount         double comment '成交金额',
    /* volume_post
     amount_post*/
    pe             float comment 'pe',
    pb             float comment 'pb',
    ps             float comment 'ps P是股价，S是每股的销售收入',
    pcf            float comment 'pcf',
    market_capital float comment '市值',
    /*  balance*/
    hold_volume_cn double comment '陆通股持有量',
    hold_ratio_cn  float comment '陆通股持股比例',
    net_volume_cn  bigint comment '陆通股净成交量'
    /* hold_volume_hk
     hold_ratio_hk
     net_volume_hk
 */
);

create index timestamp_i on stock.stock_ndata (timestamp);
create index code_i on stock.stock_ndata (code);

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
