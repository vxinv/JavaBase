CREATE TABLE `clear_record` (
  `order_id` int(11) DEFAULT NULL,
  `garbage_id` int(11) DEFAULT NULL,
  `clear_time` timestamp NULL DEFAULT NULL,
  `lat` double DEFAULT NULL,
  `lon` double DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=209 DEFAULT CHARSET=utf8