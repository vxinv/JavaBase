CREATE TABLE `test_rw` (
  `dev_id` varchar(255) DEFAULT NULL,
  `imei` varchar(255) DEFAULT NULL,
  `dev_name` varchar(255) DEFAULT NULL,
  `combination` varchar(255) DEFAULT NULL,
  `dev_type` varchar(255) DEFAULT NULL,
  `device_id` varchar(255) DEFAULT NULL,
  `maintenance_man` varchar(255) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `latitude` varchar(255) DEFAULT NULL,
  `longitude` varchar(255) DEFAULT NULL,
  `product_model` varchar(255) DEFAULT NULL,
  `connect_type` varchar(255) DEFAULT NULL,
  `version` varchar(255) DEFAULT NULL,
  `dev_sim_num` varchar(255) DEFAULT NULL,
  `rubbish_height` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `combination_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8