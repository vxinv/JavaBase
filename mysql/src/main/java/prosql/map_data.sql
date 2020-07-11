CREATE TABLE `map_data` (
  `id` int(11) DEFAULT NULL,
  `longitude` double DEFAULT NULL,
  `latitude` double DEFAULT NULL,
  `full` int(11) DEFAULT NULL,
  `garbageId` int(11) DEFAULT NULL,
  `area` int(11) DEFAULT NULL,
  `mArea` varchar(256) DEFAULT NULL,
  `groupId` int(11) DEFAULT NULL,
  `haswork` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='地图模拟数据'