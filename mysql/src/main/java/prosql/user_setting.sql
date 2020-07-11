CREATE TABLE `user_setting` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `max_clear_time` double DEFAULT '2' COMMENT '清收时间',
  `average_velocity` double DEFAULT '1' COMMENT 'm/s',
  `each_garbage_cost` double DEFAULT '3' COMMENT '平均清收单个垃圾桶所需的时间',
  `longitude` varchar(20) DEFAULT '116.397209' COMMENT '车辆出发的经度',
  `latitude` varchar(20) DEFAULT '40.007187' COMMENT '车辆出发的维度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8