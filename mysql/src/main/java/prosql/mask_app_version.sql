CREATE TABLE `mask_app_version` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` varchar(128) NOT NULL,
  `content` varchar(128) NOT NULL,
  `url` varchar(256) NOT NULL,
  `forced_update` tinyint(4) NOT NULL DEFAULT '2',
  `up_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `channel` tinyint(4) DEFAULT '6',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8