CREATE TABLE `card_command_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dev_id` varchar(128) NOT NULL COMMENT '工卡id',
  `timeout` smallint(6) DEFAULT NULL COMMENT '超时时间',
  `repetition_num` smallint(6) DEFAULT NULL COMMENT '消息重传次数',
  `position_reporting_interval` smallint(6) DEFAULT NULL COMMENT '位置上报间隔',
  `gps_position_interval` smallint(6) DEFAULT NULL COMMENT 'GPS定位间隔',
  `gps_positioning_timeout` int(11) DEFAULT NULL COMMENT 'GPS定位超时时间',
  `heat_beat_interval` smallint(6) DEFAULT NULL COMMENT '心跳周期',
  `threshold_voltage` smallint(6) DEFAULT NULL COMMENT '电压阀值',
  `aside_one` int(11) DEFAULT NULL COMMENT '预留一',
  `success` tinyint(4) DEFAULT '0' COMMENT '是否成功',
  `recive_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '接受时间',
  `down_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下发时间',
  `uuid` varchar(128) NOT NULL COMMENT '消息标识',
  PRIMARY KEY (`id`),
  KEY `dev_id_index` (`dev_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='平台向终端下发数据的记录'