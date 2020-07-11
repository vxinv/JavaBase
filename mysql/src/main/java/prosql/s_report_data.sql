CREATE TABLE `s_report_data` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `s_id` varchar(255) DEFAULT NULL COMMENT '数据唯一标识',
  `receive_time` varchar(255) DEFAULT NULL COMMENT '数据到达平台的时间格式',
  `manufacturer_id` varchar(255) DEFAULT NULL COMMENT '设备的厂商',
  `device_type_id` varchar(255) DEFAULT NULL COMMENT '设备的类型',
  `device_model_id` varchar(255) DEFAULT NULL COMMENT '设备厂商+设备类型的组合信息',
  `deviceId` varchar(255) DEFAULT NULL,
  `recordtime` varchar(255) DEFAULT NULL COMMENT '记录时间',
  `left_status` varchar(255) DEFAULT NULL COMMENT '左桶满溢状态0：正常； 1：异常',
  `right_status` varchar(255) DEFAULT NULL COMMENT '右桶满溢状态0：正常； 1：异常',
  `electric_quantity_status` varchar(255) DEFAULT NULL COMMENT '电量状态0：正常； 1：低电量',
  `signal_intensity` varchar(255) DEFAULT NULL COMMENT '信号强度',
  PRIMARY KEY (`id`),
  KEY `device_id` (`deviceId`) USING HASH
) ENGINE=InnoDB AUTO_INCREMENT=1280057 DEFAULT CHARSET=utf8