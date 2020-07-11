CREATE TABLE `ipc_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(16) NOT NULL COMMENT '用户id',
  `user_name` varchar(48) DEFAULT NULL COMMENT '姓名',
  `phone_number` varchar(16) DEFAULT NULL COMMENT '手机号',
  `user_id_card` varchar(32) DEFAULT NULL COMMENT '用户id卡',
  `user_integral` int(11) DEFAULT '0' COMMENT '用户积分',
  `home_address` varchar(128) DEFAULT NULL COMMENT '家庭住址',
  `registration_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
  `password` varchar(56) DEFAULT '123456',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uix_user_id` (`user_id`),
  KEY `idx_user_id` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COMMENT='用户表'