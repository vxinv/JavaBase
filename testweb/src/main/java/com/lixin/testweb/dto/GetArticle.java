package com.lixin.testweb.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GetArticle {
    // 为空查询所有
    String userName;
    Integer pageNo;
    Integer pageSize;
    // 1 -1 正序 逆序
    Integer timeOrder;
    Integer articleId;
    // 提醒方式
    Byte notifyType;
    // 关键字
    String keyWord;
}
