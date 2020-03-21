/*创建股票信息表*/

drop table  if exists  stock_info;
create table mysql_schemas.stock_info
(
  id             bigint auto_increment     primary key,
  rtime          date default '1990-01-01' not null,
  open_price     float                     not null,
  close_price    float                     not null,
  range_price    float                     not null,
  range_rate     float                     not null,
  lowest_price   float                     not null,
  hightest_price float                     not null,
  trade_volume   int                       not null,
  trade_money    int                       default 0,
  turnover_rate  float                     not null,
  code           varchar(8)                not null
);


drop table if exists sim_stock_info;
create table mysql_schemas.sim_stock_info(
    id             bigint auto_increment     primary key,
    code           varchar(8)                not null ,
    industry       varchar(16)                not null ,
    comName        varchar(16)                not null
);



delete from mysql_schemas.stock_info where code = '000659';


select count(bs.code) cc ,com_name,industry from
  (select * from mysql_schemas.stock_info where range_rate < -9.0  and rtime > '2020-01-27') as bs
join mysql_schemas.sim_stock_info ss on bs.code = ss.code group by ss.com_name order by   cc desc ;


select * from mysql_schemas.stock_info where code = '600237' order by rtime desc