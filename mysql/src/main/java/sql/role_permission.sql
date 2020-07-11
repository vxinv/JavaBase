CREATE TABLE `role_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  `permission_id` int(11) DEFAULT NULL COMMENT '权限id',
  PRIMARY KEY (`id`),
  KEY `fk_role` (`role_id`),
  KEY `fk_permission_id` (`permission_id`),
  CONSTRAINT `fk_permission_id` FOREIGN KEY (`permission_id`) REFERENCES `permission` (`id`),
  CONSTRAINT `fk_role` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1859 DEFAULT CHARSET=utf8