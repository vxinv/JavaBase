CREATE TABLE `upgrade_information` (
  `filename` varchar(255) DEFAULT NULL,
  `package_size` varchar(255) DEFAULT NULL,
  `device_id` varchar(255) DEFAULT NULL,
  `event_time` varchar(255) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `package_count` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=183 DEFAULT CHARSET=utf8