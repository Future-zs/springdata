package xyz.lwh.springdata.repository;

import org.springframework.data.repository.CrudRepository;
import xyz.lwh.springdata.domain.AdminUser;

/**
 * @author lwh
 * @date 2020/7/1
 **/

public interface AdminUserRepository extends CrudRepository<AdminUser, Integer> {

    /**
     * findByUsernameAndPassword 方法的简述.
     *
     * @param admin_username 账号
     * @param admin_password 密码
     * @return 返回AdminUser实体类
     */
    AdminUser findByAdminUsernameAndAdminPassword(String admin_username, String admin_password);

    /**
     * findAll 查询
     *
     * @return 查询所有
     */
    @Override
    Iterable<AdminUser> findAll();

}
