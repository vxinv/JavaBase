CREATE TABLE `user` (
  `account` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `status` int(11) DEFAULT '1' COMMENT '用户状态，1启用 2禁用 3删除',
  `create_time` varchar(255) DEFAULT NULL COMMENT '创建时间',
  `update_time` varchar(255) DEFAULT NULL COMMENT '更新时间',
  `last_login_time` varchar(255) DEFAULT NULL COMMENT '最后登陆时间',
  `name` varchar(255) DEFAULT NULL,
  `combination_id` int(11) DEFAULT '9999' COMMENT '组织机构id',
  `deadline` varchar(255) DEFAULT NULL COMMENT '账号到期时间',
  `phone` varchar(255) DEFAULT NULL,
  `up_combination` varchar(255) DEFAULT NULL COMMENT '上级组织机构',
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8