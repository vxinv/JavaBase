CREATE TABLE `access` (
  `area_num` int(11) DEFAULT NULL,
  `access_latitude` double DEFAULT NULL,
  `access_longitude` double DEFAULT NULL,
  `access_desc` tinytext,
  `access_id` int(11) NOT NULL,
  PRIMARY KEY (`access_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='区域出入口'