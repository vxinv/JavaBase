CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '角色名称',
  `description` varchar(255) DEFAULT NULL COMMENT '角色描述',
  `status` int(10) DEFAULT NULL COMMENT '2为禁用1为启用 3删除',
  `create_time` varchar(20) DEFAULT NULL COMMENT '创建时间',
  `update_time` varchar(20) DEFAULT NULL COMMENT '更新时间',
  `type` int(10) DEFAULT NULL COMMENT '1:垃圾桶 2:井盖',
  `combination_id` int(10) DEFAULT NULL COMMENT '组织机构id 0为超级管理员',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8