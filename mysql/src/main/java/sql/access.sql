CREATE TABLE `access` (
  `area_num` int(11) NOT NULL COMMENT '区域点位',
  `access_latitude` double NOT NULL,
  `access_longitude` double DEFAULT NULL,
  `access_desc` varchar(128) NOT NULL COMMENT '出入口描述',
  `access_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`access_id`)
) ENGINE=InnoDB AUTO_INCREMENT=200 DEFAULT CHARSET=utf8 COMMENT='区域出入口'