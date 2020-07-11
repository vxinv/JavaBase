CREATE TABLE `feedback` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(1024) NOT NULL DEFAULT '' COMMENT '问题描述',
  `link_name` varchar(256) NOT NULL DEFAULT '' COMMENT '联系人姓名',
  `link_method` varchar(256) NOT NULL DEFAULT '' COMMENT '联系方式',
  `commit_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '提交时间',
  `resolve` int(11) DEFAULT '0' COMMENT '1 未回复 2 已回复',
  `reply_time` datetime DEFAULT NULL COMMENT '恢复时间',
  `one_pic` longblob,
  `two_pic` longblob,
  `three_pic` longblob,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8