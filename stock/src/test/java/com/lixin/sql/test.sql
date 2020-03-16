select count(code) as cc ,code from mysql_schemas.stock_info
where rtime > '2020-03-00' and range_rate > 9.8 group by  code order by cc desc
