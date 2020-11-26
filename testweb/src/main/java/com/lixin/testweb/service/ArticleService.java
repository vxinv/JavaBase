package com.lixin.testweb.service;

import com.github.pagehelper.PageInfo;
import com.lixin.testweb.dto.GetArticle;
import com.lixin.testweb.model.Article;

public interface ArticleService {
    int saveArticle(Article article);

    PageInfo<Article> getArtical(GetArticle article);

    int deleteArticle(int articleId);

    int changeNotify(int id, int type);
}
