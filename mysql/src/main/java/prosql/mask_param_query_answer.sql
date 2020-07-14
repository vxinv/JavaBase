CREATE TABLE `mask_param_query_answer` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `devId` varchar(128) DEFAULT NULL,
  `deviceId` varchar(128) DEFAULT NULL,
  `msgSerialNum` varchar(128) DEFAULT NULL,
  `property` varchar(128) DEFAULT NULL,
  `reSendNum` varchar(128) DEFAULT NULL,
  `replySerialNum` varchar(128) DEFAULT NULL,
  `replyID` varchar(128) DEFAULT NULL,
  `replyFlg` varchar(128) DEFAULT NULL,
  `dustbinHight` varchar(128) DEFAULT NULL,
  `dustbinRealHight` varchar(128) DEFAULT NULL,
  `full` varchar(128) DEFAULT NULL,
  `clear` varchar(128) DEFAULT NULL,
  `temp` varchar(128) DEFAULT NULL,
  `angle` varchar(128) DEFAULT NULL,
  `triggers` varchar(128) DEFAULT NULL,
  `samplePeriod` varchar(128) DEFAULT NULL,
  `heartbeatPeriod` varchar(128) DEFAULT NULL,
  `openTimeout` varchar(128) DEFAULT NULL,
  `batV` varchar(128) DEFAULT NULL,
  `disinfectionPeriod` varchar(128) DEFAULT NULL,
  `disinfectionTime` varchar(128) DEFAULT NULL,
  `normalIMin` varchar(128) DEFAULT NULL,
  `stallIMax` varchar(128) DEFAULT NULL,
  `doorOpenTimeMax` varchar(128) DEFAULT NULL,
  `motorVMin` varchar(128) DEFAULT NULL,
  `motorVNormal` varchar(128) DEFAULT NULL,
  `motorVMax` varchar(128) DEFAULT NULL,
  `msgCheckSum` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `dev_id_i` (`devId`),
  KEY `device_id_i` (`deviceId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8