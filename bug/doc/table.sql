drop table if  exists fund.fund_info;
# 该表记录基金的基本信息
#
create table if not exists fund.fund_info
(
    id           bigint auto_increment primary key,
    name         varchar(31)  not null comment '基金名字',
    url          varchar(127) not null comment '网络爬的url',
    company_name varchar(31)  not null comment '基金管理的公司',
    manage       varchar(31)  not null comment '基金经理',
    fund_code    varchar(10)  not null comment '代码'
);

# 记录基金的当前的阶段收益
create table if not exists fund.stage_income
(
    id  bigint auto_increment primary key ,
    code varchar(10) not null comment '基金代码'

)



# 记录基金持仓情况

create table if not exists fund.stock_have
(
    id  bigint auto_increment primary key ,
    fcode varchar(10) not null comment '基金代码',
    scode varchar(10) not null  comment '股票代码',
    record_time tinyint not null  comment '公布日期  1 代表第一季度',
    ratio  decimal(5,2) comment '占净值比例',
    number_shares decimal(13,2) comment '持股数(万股)',
    market_value  decimal(13,2) comment '持仓市值(万元)'
)



