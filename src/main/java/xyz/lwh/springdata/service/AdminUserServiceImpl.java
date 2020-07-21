package xyz.lwh.springdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.lwh.springdata.domain.AdminUser;
import xyz.lwh.springdata.repository.AdminUserRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * @author lwh
 * @date 2020/7/1
 **/

@Service
public class AdminUserServiceImpl implements AdminUserService {

    @Autowired
    private AdminUserRepository adminUserRepository;

    private AdminUser adminUser;

    @Override
    public void save(AdminUser adminUser) {
        adminUserRepository.save(adminUser);
    }

    @Override
    public boolean login(AdminUser adminUser) {
        AdminUser data = adminUserRepository.findByAdminUsernameAndAdminPassword(adminUser.getAdminUsername(),adminUser.getAdminPassword());
        return data==null?false:true;
    }

    @Override
    public List<AdminUser> select() {
        Iterable<AdminUser> data = adminUserRepository.findAll();
        return (List<AdminUser>) data;
    }

    @Override
    public AdminUser findById(Integer id) {
        Optional<AdminUser> adminUser = adminUserRepository.findById(id);
        return adminUser.get();
    }
}
