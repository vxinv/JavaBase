CREATE TABLE `user_work_record` (
  `work_name` varchar(126) DEFAULT NULL,
  `work_car_num` varchar(56) DEFAULT NULL,
  `work_time` varchar(126) DEFAULT NULL,
  `work_time_duration` varchar(256) DEFAULT NULL,
  `car_record_id` int(11) DEFAULT NULL,
  `phone_imei` varchar(56) DEFAULT NULL,
  `employ_id` int(11) DEFAULT NULL,
  `cid` int(11) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  UNIQUE KEY `user_work_record_id_uindex` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=332 DEFAULT CHARSET=utf8