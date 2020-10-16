package com.lixin.testweb.controller;


import com.goodluck.commom.api.CommonResult;
import com.lixin.testweb.model.Article;
import com.lixin.testweb.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @PostMapping("/saveArticle")
    public CommonResult<Article> saveArticle(@RequestBody Article article) {
        Integer id = articleService.saveArticle(article);
        return CommonResult.success(article);
    }


    public Article getArtical(Article article) {
        return null;
    }


    public int deleteArticle(Article article) {
        return 0;
    }

}
