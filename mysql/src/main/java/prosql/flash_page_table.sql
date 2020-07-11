CREATE TABLE `flash_page_table` (
  `cid` int(11) NOT NULL COMMENT '组织机构id',
  `fpurl` varchar(256) NOT NULL COMMENT '启动页的地址',
  `ctime` datetime DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8