package xyz.lwh.springdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.lwh.springdata.domain.Article;
import xyz.lwh.springdata.repository.ArticleRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author lwh
 * @date 2020/7/19
 **/
@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public void save(Article article) {
        articleRepository.save(article);
    }


    @Override
    public List<Article> select() {
        Iterable<Article> data = articleRepository.findAll();
        return (List<Article>) data;
    }

    @Override
    public Article findById(Integer id) {
        Optional<Article> article = articleRepository.findById(id);
        return article.get();
    }
}
