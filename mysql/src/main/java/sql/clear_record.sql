CREATE TABLE `clear_record` (
  `order_id` int(11) NOT NULL,
  `garbage_id` int(11) DEFAULT NULL,
  `clear_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `lat` double DEFAULT NULL COMMENT '维度',
  `lon` double DEFAULT NULL COMMENT '经度',
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=280 DEFAULT CHARSET=utf8