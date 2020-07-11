CREATE TABLE `s_terminal_infomation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `imei` varchar(255) DEFAULT NULL,
  `gps` varchar(255) DEFAULT NULL,
  `uuid` varchar(255) DEFAULT NULL,
  `dev_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `uuid` (`uuid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1408 DEFAULT CHARSET=utf8