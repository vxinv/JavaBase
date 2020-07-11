CREATE TABLE `user_work_record` (
  `work_name` tinytext,
  `work_car_num` tinytext,
  `work_time` tinytext,
  `work_time_duration` varchar(256) DEFAULT NULL,
  `car_record_id` int(11) DEFAULT NULL,
  `phone_imei` tinytext,
  `employ_id` int(11) DEFAULT NULL,
  `cid` int(11) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_work_record_id_uindex` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=329 DEFAULT CHARSET=utf8