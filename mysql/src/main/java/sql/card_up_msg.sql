CREATE TABLE `card_up_msg` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dev_id` varchar(56) DEFAULT NULL COMMENT '设备id',
  `up_type` int(11) DEFAULT NULL COMMENT '上报类型',
  `dev_status` int(11) DEFAULT NULL COMMENT '设备状态',
  `conn_type` tinyint(4) DEFAULT NULL COMMENT '接入方式',
  `bat_v` smallint(6) DEFAULT NULL COMMENT '电池电压',
  `sig_q` smallint(6) DEFAULT NULL COMMENT '信号质量',
  `signal_p` smallint(6) DEFAULT NULL COMMENT '信号功率',
  `total_power` smallint(6) DEFAULT NULL COMMENT '总功率',
  `tx_power` smallint(6) DEFAULT NULL COMMENT '发射功率',
  `SNR` smallint(6) DEFAULT NULL COMMENT '信噪比',
  `RSRQ` smallint(6) DEFAULT NULL COMMENT '参考信号接收质量',
  `RSRP` smallint(6) DEFAULT NULL COMMENT '参考信号接收功率',
  `cell_id` int(11) DEFAULT NULL COMMENT '小区位置信息',
  `PCI` smallint(6) DEFAULT NULL COMMENT '物理小区标识',
  `valid` tinyint(4) DEFAULT NULL COMMENT '有效性',
  `derict` tinyint(4) DEFAULT NULL COMMENT '方位',
  `lat` varchar(88) DEFAULT NULL COMMENT '纬度',
  `lon` varchar(88) DEFAULT NULL COMMENT '经度',
  `stepNum` smallint(6) DEFAULT NULL COMMENT '步数',
  `tem` smallint(6) DEFAULT NULL COMMENT '温度',
  `up_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '上报时间',
  `ECL` smallint(6) DEFAULT NULL COMMENT '无线信号覆盖等级',
  PRIMARY KEY (`id`),
  KEY `dev_id_index` (`dev_id`)
) ENGINE=InnoDB AUTO_INCREMENT=437 DEFAULT CHARSET=utf8 COMMENT='工卡的上报信息'