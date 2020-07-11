CREATE TABLE `operational_log` (
  `account` varchar(255) DEFAULT NULL,
  `number` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `login_time` varchar(255) DEFAULT NULL,
  `address_ip` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL COMMENT '类型 哪种操作',
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `operational_time` varchar(255) DEFAULT NULL,
  `current_z_time` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=337 DEFAULT CHARSET=utf8