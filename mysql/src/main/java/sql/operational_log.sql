CREATE TABLE `operational_log` (
  `account` varchar(255) DEFAULT NULL,
  `number` varchar(255) DEFAULT NULL COMMENT '手机号',
  `description` varchar(255) DEFAULT NULL,
  `operational_time` varchar(255) DEFAULT NULL,
  `address_ip` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL COMMENT '类型 哪种操作',
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `current_z_time` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=282 DEFAULT CHARSET=utf8