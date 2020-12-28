#  笔记表
drop table if exists lx.article;
create table if not exists lx.article
(
    id           bigint auto_increment primary key,
    user_name    varchar(20) not null comment 'author',
    content      text        not null comment '文本',
    title        varchar(64) comment '笔记标题',
    publish_time datetime default current_timestamp(),
    notify       tinyint default 0 comment '提醒方式'
);

# 用户表
drop table if exists lx.user;
create table if not exists lx.user
(
    id        int auto_increment primary key,
    user_name varchar(20) not null comment '用户名',
    pass_word varchar(20) not null default '000000' comment '密码',
    mail      varchar(64) not null comment '邮箱',
    code      varchar(6)  not null comment '邮箱验证码'
);
create unique index ui_u_n on lx.user (user_name);

# 文件管理
drop table  if exists lx.file_manager;
create table if not exists  lx.file_manager
(
    file_id int auto_increment primary key  comment '主键',
    file_name varchar(20) not null comment '文件名称',
    file_time datetime not null default current_timestamp() comment '上传时间',
    user_name varchar(20) not null  comment '用户id',
    file_key varchar(60) not null  comment '文件下载地址',
    file_size int not null default 0 comment '文件大小',
    file_class varchar(20) comment '文件分类',
    file_second_class varchar(20) comment '二级分类'
)




