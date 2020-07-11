CREATE TABLE `work_time` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `startTime` tinytext,
  `endTime` tinytext,
  `timeName` tinytext,
  `cid` int(11) DEFAULT NULL,
  `other1` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8