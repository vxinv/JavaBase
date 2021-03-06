CREATE TABLE `terminal_register_answer` (
  `notify_type` varchar(255) DEFAULT NULL,
  `request_id` varchar(255) DEFAULT NULL,
  `device_id` varchar(255) DEFAULT NULL,
  `gateway_id` varchar(255) DEFAULT NULL,
  `service_id` varchar(255) DEFAULT NULL,
  `service_type` varchar(255) DEFAULT NULL,
  `event_time` varchar(255) DEFAULT NULL,
  `msg_id` varchar(255) DEFAULT NULL,
  `msg_serial_num` varchar(255) DEFAULT NULL,
  `property` varchar(255) DEFAULT NULL,
  `reply_id` varchar(255) DEFAULT NULL,
  `reply_serial_num` varchar(255) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `reply_flg` varchar(255) DEFAULT NULL,
  `dev_type` varchar(255) DEFAULT NULL,
  `connect_type` varchar(255) DEFAULT NULL,
  `dev_real_hight` varchar(255) DEFAULT NULL,
  `dev_id` varchar(255) DEFAULT NULL,
  `dev_sim_num` varchar(255) DEFAULT NULL,
  `dev_imei` varchar(255) DEFAULT NULL,
  `dev_model` varchar(255) DEFAULT NULL,
  `reg_year` varchar(255) DEFAULT NULL,
  `reg_month` varchar(255) DEFAULT NULL,
  `reg_day` varchar(255) DEFAULT NULL,
  `reg_hour` varchar(255) DEFAULT NULL,
  `reg_min` varchar(255) DEFAULT NULL,
  `reg_sec` varchar(255) DEFAULT NULL,
  `active_year` varchar(255) DEFAULT NULL,
  `active_month` varchar(255) DEFAULT NULL,
  `active_day` varchar(255) DEFAULT NULL,
  `active_hour` varchar(255) DEFAULT NULL,
  `active_min` varchar(255) DEFAULT NULL,
  `active_sec` varchar(255) DEFAULT NULL,
  `soft_ver` varchar(255) DEFAULT NULL,
  `msg_check_sum` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8