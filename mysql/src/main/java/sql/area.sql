CREATE TABLE `area` (
  `area_num` int(11) NOT NULL AUTO_INCREMENT COMMENT '区域编号',
  `mArea` varchar(128) NOT NULL DEFAULT '' COMMENT '区域名称',
  `combination_id` int(11) DEFAULT NULL COMMENT '组织机构id',
  PRIMARY KEY (`area_num`),
  UNIQUE KEY `area_mArea_uindex` (`mArea`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='区域规划'