CREATE TABLE `param_set_answer` (
  `notify_type` varchar(255) DEFAULT NULL,
  `request_id` varchar(255) DEFAULT NULL,
  `device_id` varchar(255) DEFAULT NULL,
  `gateway_id` varchar(255) DEFAULT NULL,
  `service_id` varchar(255) DEFAULT NULL,
  `service_type` varchar(255) DEFAULT NULL,
  `eventTime` varchar(255) DEFAULT NULL,
  `msg_id` varchar(255) DEFAULT NULL,
  `msg_serial_num` varchar(255) DEFAULT NULL,
  `property` varchar(255) DEFAULT NULL,
  `reply_serial_num` varchar(255) DEFAULT NULL,
  `reply_id` varchar(255) DEFAULT NULL,
  `result` varchar(255) DEFAULT NULL,
  `msg_check_sum` varchar(255) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8