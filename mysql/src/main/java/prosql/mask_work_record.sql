CREATE TABLE `mask_work_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `etime` timestamp NULL DEFAULT '1990-01-01 00:00:00',
  `wid` varchar(128) DEFAULT '',
  `cnum` int(11) DEFAULT '0',
  `uid` varchar(126) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8 COMMENT='口罩回收工作记录'