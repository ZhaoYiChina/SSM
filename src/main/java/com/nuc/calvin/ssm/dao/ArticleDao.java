package com.nuc.calvin.ssm.dao;

import com.nuc.calvin.ssm.entity.Article;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface ArticleDao {
    /**
     * 通过文章id查询
     *
     * @param articleId
     * @return
     */
    Article QueryById(int articleId);

    /**
     * 查询所有文章
     *
     * @return
     */
    List<Article> QueryAll();

    /**
     * 增加文章
     * @param article
     * @return
     */
    int addArticle(Article article);

    /**
     * 删除文章
     *
     * @param articleId
     * @return
     */
    int deleteArticle(int articleId);

}
