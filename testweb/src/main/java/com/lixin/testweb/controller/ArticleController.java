package com.lixin.testweb.controller;


import com.github.pagehelper.PageInfo;
import com.lixin.testweb.api.CommonResult;
import com.lixin.testweb.dto.GetArticle;
import com.lixin.testweb.model.Article;
import com.lixin.testweb.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ArticleController {

    @Autowired
    ArticleService articleService;

    /**
     * 保存笔记
     * @param article
     * @return
     */
    @PostMapping("/saveArticle")
    public CommonResult<Article> saveArticle(@RequestBody Article article) {
        Integer id = articleService.saveArticle(article);
        return CommonResult.success(article);
    }


    /**
     * 获取笔记
     * @param article
     * @return
     */
    @PostMapping("/getArticle")
    public CommonResult<PageInfo<Article>> getArtical(@RequestBody GetArticle article) {
        return CommonResult.success(articleService.getArtical(article));
    }


    @GetMapping("/deleteArticle")
    public CommonResult<Integer> deleteArticle(@RequestParam("id") int articleId) {
        return CommonResult.success(articleService.deleteArticle(articleId));
    }

    @GetMapping("/changeNotify")
    public CommonResult<Integer> changeNotify(@RequestParam("id") int articleId, @RequestParam("notifyType") int type) {
        return CommonResult.success(articleService.changeNotify(articleId, type));
    }

}
