CREATE TABLE `loginout` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` int(11) DEFAULT '0' COMMENT '用户名',
  `login_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '登录时间',
  `login_ip` varchar(56) DEFAULT '' COMMENT '登录ip',
  `login_success` int(11) DEFAULT '0' COMMENT '1 成功 2 失败',
  `logout_time` datetime DEFAULT NULL COMMENT '登出时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1015 DEFAULT CHARSET=utf8