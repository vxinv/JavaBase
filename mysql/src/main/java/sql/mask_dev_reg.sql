CREATE TABLE `mask_dev_reg` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `msgSerialNum` varchar(126) DEFAULT NULL,
  `property` varchar(126) DEFAULT NULL,
  `reSendNum` varchar(126) DEFAULT NULL,
  `devType` varchar(126) DEFAULT NULL,
  `connectType` varchar(126) DEFAULT NULL,
  `devRealHight` varchar(126) DEFAULT NULL,
  `devID` varchar(126) DEFAULT NULL,
  `devImsi` varchar(126) DEFAULT NULL,
  `devImei` varchar(126) DEFAULT NULL,
  `devModel` varchar(126) DEFAULT NULL,
  `softVer` varchar(126) DEFAULT NULL,
  `doorSoftVer` varchar(126) DEFAULT NULL,
  `msgCheckSum` varchar(126) DEFAULT NULL,
  `time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8