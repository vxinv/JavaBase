package com.lixin.testweb.service.impl;

import com.goodluck.commom.api.ResultCode;
import com.goodluck.commom.exception.ApiException;
import com.lixin.testweb.model.Article;
import com.lixin.testweb.service.ArticleService;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Override
    public int saveArticle(Article article) {
        if (article.getContent() != null) {
            throw new ApiException(ResultCode.UNAUTHORIZED);
        }
        return 0;
    }

    @Override
    public Article getArtical(Article article) {
        return null;
    }

    @Override
    public int deleteArticle(Article article) {
        return 0;
    }
}
