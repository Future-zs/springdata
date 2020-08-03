package xyz.lwh.springdata.service;

import xyz.lwh.springdata.domain.Article;

import java.util.List;

/**
 * @author lwh
 * @date 2020/7/19
 **/
public interface ArticleService {
    void save(Article article);
    List<Article> select();
    Article findById(Integer id);
    void delete(Article article);
}
