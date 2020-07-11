CREATE TABLE `mask_dev_reg_send` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `devId` varchar(128) DEFAULT NULL,
  `deviceId` varchar(128) DEFAULT NULL,
  `serviceType` varchar(128) DEFAULT NULL,
  `msgSerialNum` varchar(128) DEFAULT NULL,
  `property` varchar(128) DEFAULT NULL,
  `reSendNum` varchar(128) DEFAULT NULL,
  `devType` varchar(128) DEFAULT NULL,
  `connectType` varchar(128) DEFAULT NULL,
  `devRealHight` varchar(128) DEFAULT NULL,
  `devImsi` varchar(128) DEFAULT NULL,
  `devImei` varchar(128) DEFAULT NULL,
  `devModel` varchar(128) DEFAULT NULL,
  `softVer` varchar(128) DEFAULT NULL,
  `doorSoftVer` varchar(128) DEFAULT NULL,
  `msgCheckSum` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1144 DEFAULT CHARSET=utf8