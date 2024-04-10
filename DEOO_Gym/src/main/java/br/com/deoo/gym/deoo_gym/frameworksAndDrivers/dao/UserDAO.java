package br.com.deoo.gym.deoo_gym.frameworksAndDrivers.dao;

import br.com.deoo.gym.deoo_gym.entity.User;

import java.util.List;

public interface UserDAO {

    boolean insert(User user);
    boolean delete(int id);
    List<User> getAllUsers();
    User getUserById(int id);

}
