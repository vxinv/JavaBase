CREATE TABLE `card_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dev_type` int(11) DEFAULT NULL COMMENT '设备类型',
  `dev_conn_method` int(11) DEFAULT NULL COMMENT '设备连接方式\n',
  `dev_id` varchar(128) DEFAULT NULL COMMENT '设备id',
  `sim_num` varchar(256) DEFAULT NULL COMMENT 'SIM卡号/网络地址号\n',
  `imei` varchar(128) DEFAULT NULL COMMENT 'IMEI',
  `dev_type_num` varchar(128) DEFAULT NULL COMMENT '设备型号',
  `sw_version` varchar(128) DEFAULT NULL COMMENT '软件版本',
  PRIMARY KEY (`id`),
  KEY `dev_id_index` (`dev_id`)
) ENGINE=InnoDB AUTO_INCREMENT=439 DEFAULT CHARSET=utf8 COMMENT='工卡的注册信息'