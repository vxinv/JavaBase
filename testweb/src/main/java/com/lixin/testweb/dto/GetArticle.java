package com.lixin.testweb.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GetArticle {
    String userName;
    Integer pageNo;
    Integer pageSize;
    // 1 -1
    Integer timeOrder;
    Integer articleId;
}
