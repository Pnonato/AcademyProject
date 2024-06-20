package br.com.deoo.gym.deoo_gym.B_useCases.DAOInterfaces;

import br.com.deoo.gym.deoo_gym.A_entity.User;

import java.util.List;

public interface UserDAO {

    void insertUser(User user) throws Exception;
    boolean delete(int id);
    List<User> getAllUsers();
    User getUserById(int id);
    User getUserByEmail(String email);
    void updateUser(int id, User updatedUser);
}
