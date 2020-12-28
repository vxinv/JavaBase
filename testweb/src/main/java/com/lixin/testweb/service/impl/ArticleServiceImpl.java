package com.lixin.testweb.service.impl;

import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lixin.testweb.api.ResultCode;
import com.lixin.testweb.dao.ArticleMapper;
import com.lixin.testweb.dto.GetArticle;
import com.lixin.testweb.exception.ApiException;
import com.lixin.testweb.model.Article;
import com.lixin.testweb.model.ArticleExample;
import com.lixin.testweb.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleMapper articleMapper;

    @Override
    public int saveArticle(Article article) {
        if (article.getId() != null && article.getId() != 0) {
            return articleMapper.updateByPrimaryKeySelective(article);
        }
        article.setPublishTime(LocalDateTime.now());
        return articleMapper.insert(article);

    }

    @Override
    public PageInfo<Article> getArtical(GetArticle article) {

        // 传入主键 单独处理
        if (article.getArticleId() != null) {
            Article art = articleMapper.selectByPrimaryKey(Long.valueOf(article.getArticleId()));
            ArrayList<Article> articles = new ArrayList<>();
            articles.add(art);
            return new PageInfo<>(articles);
        }

        PageHelper.startPage(article.getPageNo(), article.getPageSize());
        ArticleExample atc = new ArticleExample();
        ArticleExample.Criteria criteria = atc.createCriteria();
        if (StrUtil.isNotBlank(article.getUserName())) {
            criteria.andUserNameEqualTo(article.getUserName());
        }
        if (article.getNotifyType() != 0) {
            criteria.andNotifyEqualTo(article.getNotifyType());
        }
        if (StrUtil.isNotBlank(article.getKeyWord())) {
            criteria.andTitleLike(article.getKeyWord());
        }
        atc.setOrderByClause(article.getTimeOrder() > 0 ? "publish_time desc" : "publish_time asc");
        List<Article> articles = articleMapper.selectByExample(atc);
        return new PageInfo<>(articles);
    }

    @Override
    public int deleteArticle(int articleId) {
        return articleMapper.deleteByPrimaryKey((long) articleId);
    }

    @Override
    public int changeNotify(int id, int type) {
        Article article = new Article();
        article.setNotify((byte) type);
        article.setId((long) id);
        int i = articleMapper.updateByPrimaryKeySelective(article);
        if (i != 1) {
            throw new ApiException(ResultCode.FAILED);
        }
        return i;
    }
}
