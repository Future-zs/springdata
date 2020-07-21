package xyz.lwh.springdata.service;

import xyz.lwh.springdata.domain.AdminUser;

import java.util.List;

/**
 * @author lwh
 * @date 2020/7/18
 **/
public interface AdminUserService {
    void save(AdminUser adminUser);
    boolean login(AdminUser adminUser);
    List<AdminUser> select();
    AdminUser findById(Integer id);
}
