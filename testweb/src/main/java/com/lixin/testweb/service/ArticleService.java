package com.lixin.testweb.service;

import com.lixin.testweb.model.Article;

public interface ArticleService {
     int saveArticle(Article article);

     Article getArtical(Article article);

     int deleteArticle(Article article);
}
