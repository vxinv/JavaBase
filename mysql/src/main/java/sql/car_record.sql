CREATE TABLE `car_record` (
  `record_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '记录id',
  `employ_id` int(11) DEFAULT NULL COMMENT '''人员id''',
  `start_time` datetime DEFAULT NULL COMMENT '开始时间',
  `end_time` datetime DEFAULT NULL COMMENT '结束时间',
  `clear_num` int(11) DEFAULT NULL COMMENT '''本次清收个数''',
  `clear_seri` mediumtext COMMENT '''清收序列''',
  `car_id` int(11) DEFAULT NULL COMMENT '清收车id',
  `recive` int(11) DEFAULT '0' COMMENT '0 未领取 1已领取',
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8369 DEFAULT CHARSET=utf8 COMMENT='车辆清收记录表'