package com.lixin.testweb.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GetArticle {
    String userName;
    int pageNo;
    int pageSize;
    // 1 -1
    int timeOrder;
}
