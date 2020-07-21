package xyz.lwh.springdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.lwh.springdata.domain.User;
import xyz.lwh.springdata.repository.UserRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author lwh
 * @date 2020/7/1
 **/

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    private User user;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public boolean login(User user) {
        User data = userRepository.findByUsernameAndPassword(user.getUsername(),user.getPassword());
        return data==null?false:true;
    }

    @Override
    public List<User> select() {
        Iterable<User> data = userRepository.findAll();
        return (List<User>) data;
    }

    @Override
    public User findById(Integer id) {
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }
}
