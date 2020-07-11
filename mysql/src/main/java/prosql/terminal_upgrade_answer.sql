CREATE TABLE `terminal_upgrade_answer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `service_id` varchar(255) DEFAULT NULL,
  `service_type` varchar(255) DEFAULT NULL,
  `event_time` varchar(255) DEFAULT NULL,
  `msg_id` varchar(255) DEFAULT NULL,
  `msg_serial_num` varchar(255) DEFAULT NULL,
  `property` varchar(255) DEFAULT NULL,
  `reply_id` varchar(255) DEFAULT NULL,
  `devSerialNum` varchar(255) DEFAULT NULL,
  `succeedDlPkgNum` varchar(255) DEFAULT NULL,
  `upgRes` varchar(255) DEFAULT NULL,
  `msgCheckSum` varchar(255) DEFAULT NULL,
  `device_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=150511 DEFAULT CHARSET=utf8