create table stock.stock_ndata
(
    id             bigint auto_increment primary key,
    code           varchar(10)    null comment '代码',
    timestamp      datetime       null comment '日期',
    volume         bigint         null comment '当天成交量',
    open           decimal(10, 2) null comment '当天开盘价',
    high           decimal(10, 2) null comment '当天最高价',
    low            decimal(10, 2) null comment '当天最低价',
    close          decimal(10, 2) null comment '当天收盘价',
    chg            float          null comment '涨跌额',
    percent        float          null comment '涨跌幅',
    turnoverrate   float          null comment '换手率(%)',
    amount         double         null comment '成交金额',
    pe             float          null comment 'pe',
    pb             float          null comment 'pb',
    ps             float          null comment 'ps',
    pcf            float          null comment 'pcf',
    market_capital float          null comment '市值',
    hold_volume_cn double         null comment '陆通股持有量',
    hold_ratio_cn  float          null comment '陆通股持股比例',
    net_volume_cn  bigint         null comment '陆通股净成交量'
);

create table stock.stock_ncode
(
    id                     int auto_increment comment 'id' primary key,
    company_name           varchar(12) not null comment '公司名称',
    stock_code             varchar(12) not null comment '股票代码',
    total_shares           bigint      null comment '总股本',
    total_assets           bigint      null comment '总资产',
    gross_profit_margin    float       null comment '销售毛利率',
    roe                    float       null comment '净资产收益率',
    earnings_per_share     float       null comment '每股收益',
    net_asset_per_share    float       null comment '每股净资产',
    cash_flow_per_share    float       null comment '每股现金流',
    float_market_capital   bigint      null comment '流通值',
    float_shares           bigint      null comment '流通股(元)',
    total_operating_income bigint      null comment '营业总收入(元)',
    net_profit_cagr        double      null comment '净利润',
    one_category_id        int         null comment '一级分类id',
    one_category           varchar(10) null comment '名称',
    two_category_id        int         null comment '二级分类id',
    two_category           varchar(10) null comment '名称',
    three_category_id      int         null comment '三级分类',
    three_category         varchar(10) null comment '名称'
);