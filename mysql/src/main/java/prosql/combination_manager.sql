CREATE TABLE `combination_manager` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `p_id` int(11) DEFAULT NULL COMMENT '父id',
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `address` varchar(255) DEFAULT NULL,
  `status` int(255) DEFAULT NULL COMMENT '1启用2禁用',
  `remark` varchar(255) DEFAULT NULL,
  `contact` varchar(255) DEFAULT NULL,
  `com_email` varchar(255) DEFAULT '',
  `close` tinyint(4) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10016 DEFAULT CHARSET=utf8