#  笔记
create table if not exists stock.lx_article
(
    id           bigint auto_increment primary key,
    author       varchar(20) not null comment 'author',
    content      text        not null comment '文本',
    publish_time datetime default current_timestamp()
)


