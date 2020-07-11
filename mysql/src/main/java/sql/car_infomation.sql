CREATE TABLE `car_infomation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `car_number` varchar(256) NOT NULL DEFAULT '' COMMENT '车牌号',
  `car_terminal_number` varchar(256) DEFAULT '' COMMENT '车辆终端设备号',
  `car_status` int(11) DEFAULT '1' COMMENT '1 启用 2 禁用',
  `delete_flag` int(11) DEFAULT '0' COMMENT '删除标志 0 未删除 1 删除',
  `remark` varchar(256) DEFAULT '' COMMENT '备注',
  `car_name` varchar(256) DEFAULT '' COMMENT '车辆名称',
  `combination_id` int(11) DEFAULT NULL COMMENT '机构id',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `hasWork` int(11) DEFAULT '0' COMMENT '0 没任务 1有任务',
  `type` int(11) DEFAULT '0' COMMENT '0 可回收 1 不可回收',
  PRIMARY KEY (`id`),
  UNIQUE KEY `car_infomation_id_uindex` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8