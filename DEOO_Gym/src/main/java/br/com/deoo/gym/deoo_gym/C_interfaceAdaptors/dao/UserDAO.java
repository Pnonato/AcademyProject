package br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.dao;

import br.com.deoo.gym.deoo_gym.A_entity.User;

import java.util.List;

public interface UserDAO {

    boolean insert(User user);
    boolean delete(int id);
    List<User> getAllUsers();
    User getUserById(int id);

    User getUserByEmail(String email); //adicionar o metodo no implementação tb
}
