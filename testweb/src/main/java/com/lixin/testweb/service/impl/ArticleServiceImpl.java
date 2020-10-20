package com.lixin.testweb.service.impl;

import com.lixin.testweb.dao.ArticleMapper;
import com.lixin.testweb.model.Article;
import com.lixin.testweb.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleMapper articleMapper;

    @Override
    public int saveArticle(Article article) {

        //article.setPublishTime(LocalDateTime.now());

        return articleMapper.insert(article);

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
