CREATE TABLE `dev_location_answer` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `devId` varchar(128) DEFAULT NULL,
  `deviceId` varchar(128) DEFAULT NULL,
  `serviceType` varchar(128) DEFAULT NULL,
  `msgSerialNum` varchar(128) DEFAULT NULL,
  `property` varchar(128) DEFAULT NULL,
  `reSendNum` varchar(128) DEFAULT NULL,
  `replySerialN` varchar(128) DEFAULT NULL,
  `replyID` varchar(128) DEFAULT NULL,
  `locationResu` varchar(128) DEFAULT NULL,
  `direction` varchar(128) DEFAULT NULL,
  `latitude` varchar(128) DEFAULT NULL,
  `longitude` varchar(128) DEFAULT NULL,
  `msgCheckSum` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `dev_id_i` (`devId`),
  KEY `device_id_i` (`deviceId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8