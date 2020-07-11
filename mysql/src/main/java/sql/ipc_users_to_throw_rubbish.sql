CREATE TABLE `ipc_users_to_throw_rubbish` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(16) NOT NULL COMMENT '用户id',
  `one_garbage_weight` double DEFAULT '0' COMMENT '1 垃圾桶投放量',
  `two_garbage_weight` double DEFAULT '0' COMMENT '1 垃圾桶投放量',
  `three_garbage_weight` double DEFAULT '0' COMMENT '1 垃圾桶投放量',
  `four_garbage_weight` double DEFAULT '0' COMMENT '1 垃圾桶投放量',
  `throw_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '时间',
  PRIMARY KEY (`id`),
  KEY `idx_user_id` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 COMMENT='用户投垃圾'