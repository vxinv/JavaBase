CREATE TABLE `employe` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT '' COMMENT '员工姓名',
  `phone_number` varchar(12) DEFAULT '' COMMENT '手机号码',
  `job_status` int(11) DEFAULT '1' COMMENT '在职状态 1 在职 2 离职',
  `remark` varchar(256) DEFAULT '' COMMENT '备注',
  `gender` int(11) DEFAULT '1' COMMENT '1 男性 2 女性',
  `delete_flag` int(11) DEFAULT '0' COMMENT '删除标志 0 未删除 1 删除',
  `address` varchar(256) DEFAULT '' COMMENT '地址',
  `user_id` varchar(24) DEFAULT '' COMMENT '用户名',
  `password` varchar(256) DEFAULT '0' COMMENT '密码',
  `combination_id` int(11) DEFAULT NULL COMMENT '机构id',
  `employe_id` varchar(256) DEFAULT '' COMMENT '工号',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8