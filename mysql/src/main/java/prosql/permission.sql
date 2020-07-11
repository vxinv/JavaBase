CREATE TABLE `permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '权限名称',
  `description` varchar(255) DEFAULT NULL COMMENT '权限描述',
  `permission_code` varchar(255) DEFAULT NULL COMMENT '权限标识',
  `parent_id` int(11) DEFAULT NULL COMMENT '父级权限id',
  `type` int(11) DEFAULT NULL COMMENT '类型 0菜单 1按钮 2目录',
  `order_num` int(11) DEFAULT NULL COMMENT '排序',
  `status` int(11) DEFAULT NULL COMMENT '状态 1 有效 2删除',
  `create_time` varchar(0) DEFAULT NULL COMMENT '创建时间',
  `update_time` varchar(0) DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=utf8