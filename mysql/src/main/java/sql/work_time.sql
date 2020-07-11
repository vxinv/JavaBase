CREATE TABLE `work_time` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `startTime` varchar(56) DEFAULT NULL,
  `endTime` varchar(56) DEFAULT NULL,
  `timeName` varchar(56) DEFAULT NULL,
  `cid` int(11) DEFAULT NULL,
  `other1` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8