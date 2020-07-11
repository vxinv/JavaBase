CREATE TABLE `timing_answer` (
  `notifyType` varchar(255) DEFAULT NULL,
  `deviceId` varchar(255) DEFAULT NULL,
  `gatewayId` varchar(255) DEFAULT NULL,
  `serviceId` varchar(255) DEFAULT NULL,
  `serviceType` varchar(255) DEFAULT NULL,
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