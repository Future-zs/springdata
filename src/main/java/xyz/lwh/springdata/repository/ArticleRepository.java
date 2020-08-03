package xyz.lwh.springdata.repository;

import org.springframework.data.repository.CrudRepository;
import xyz.lwh.springdata.domain.Article;

/**
 * @author lwh
 * @date 2020/7/1
 **/

public interface ArticleRepository extends CrudRepository<Article, Integer> {



    /**
     * findAll 查询
     *
     * @return 查询所有
     */
    @Override
    Iterable<Article> findAll();
}
