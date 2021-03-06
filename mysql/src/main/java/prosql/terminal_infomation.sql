CREATE TABLE `terminal_infomation` (
  `dev_id` varchar(255) DEFAULT NULL COMMENT 'SN号',
  `imei` varchar(255) DEFAULT NULL COMMENT 'imei号',
  `dev_name` varchar(255) DEFAULT NULL COMMENT '设备名称',
  `combination` varchar(255) DEFAULT NULL COMMENT '组织机构',
  `dev_type` varchar(255) DEFAULT NULL COMMENT '设备类型',
  `device_id` varchar(255) DEFAULT NULL COMMENT '设备ID',
  `maintenance_man` varchar(255) DEFAULT NULL COMMENT '维护人',
  `location` varchar(255) DEFAULT NULL COMMENT '位置',
  `latitude` varchar(255) DEFAULT NULL COMMENT '纬度',
  `longitude` varchar(255) DEFAULT NULL COMMENT '经度',
  `product_model` varchar(255) DEFAULT NULL COMMENT '设备型号',
  `connect_type` varchar(255) DEFAULT NULL COMMENT '连接方式',
  `version` varchar(255) DEFAULT NULL COMMENT '版本号',
  `dev_sim_num` varchar(255) DEFAULT NULL COMMENT '卡号',
  `rubbish_height` varchar(255) DEFAULT NULL COMMENT '垃圾桶高度',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `combination_id` int(11) DEFAULT NULL COMMENT '组织机构ID',
  `group_id` int(11) DEFAULT '0' COMMENT '分组ID',
  `delete_flag` int(11) DEFAULT '0' COMMENT '软删除的标识 0未删除 1删除',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `garbage_id` int(11) DEFAULT NULL COMMENT '垃圾桶id',
  `group_type` varchar(12) DEFAULT 'A',
  `lon84` varchar(128) DEFAULT NULL,
  `lat84` varchar(128) DEFAULT NULL,
  `type` int(11) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `dev_id` (`dev_id`) USING HASH,
  KEY `device_id` (`device_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=490 DEFAULT CHARSET=utf8