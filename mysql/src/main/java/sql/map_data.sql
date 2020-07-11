CREATE TABLE `map_data` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `longitude` double NOT NULL,
  `latitude` double NOT NULL,
  `full` int(11) DEFAULT '0',
  `garbageId` int(11) NOT NULL,
  `area` int(11) DEFAULT NULL,
  `mArea` varchar(256) DEFAULT NULL COMMENT '区域名字',
  `groupId` int(11) NOT NULL COMMENT '唯一id',
  `haswork` int(11) DEFAULT '0' COMMENT '0 代表没有车辆去清收\n1 代表有车辆去请收',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1739 DEFAULT CHARSET=utf8 COMMENT='地图模拟数据'