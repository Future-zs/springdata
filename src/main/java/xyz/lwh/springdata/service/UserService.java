package xyz.lwh.springdata.service;

import xyz.lwh.springdata.domain.User;

import java.util.List;

/**
 * @author lwh
 * @date 2020/7/18
 **/
public interface UserService {
    void save(User user);
    boolean login(User user);
    List<User> select();
    User findById(Integer id);
}
