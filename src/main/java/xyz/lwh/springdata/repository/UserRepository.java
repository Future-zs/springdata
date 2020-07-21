package xyz.lwh.springdata.repository;

import org.springframework.data.repository.CrudRepository;
import xyz.lwh.springdata.domain.User;

/**
 * @author lwh
 * @date 2020/7/1
 **/

public interface UserRepository extends CrudRepository<User, Integer> {

    /**
     * findByUsernameAndPassword 方法的简述.
     *
     * @param username 账号
     * @param password 密码
     * @return 返回User实体类
     */
    User findByUsernameAndPassword(String username, String password);

    /**
     * findAll 查询
     *
     * @return 查询所有
     */
    @Override
    Iterable<User> findAll();

}
