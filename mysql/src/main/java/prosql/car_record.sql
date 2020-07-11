CREATE TABLE `car_record` (
  `record_id` int(11) NOT NULL AUTO_INCREMENT,
  `employ_id` int(11) DEFAULT NULL,
  `start_time` timestamp NULL DEFAULT NULL,
  `end_time` timestamp NULL DEFAULT NULL,
  `clear_num` int(11) DEFAULT NULL,
  `clear_seri` mediumtext,
  `car_id` int(11) DEFAULT NULL,
  `recive` int(11) DEFAULT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB AUTO_INCREMENT=418 DEFAULT CHARSET=utf8 COMMENT='车辆清收记录表'