package br.com.deoo.gym.deoo_gym.B_useCases;

import br.com.deoo.gym.deoo_gym.A_entity.User;

import java.util.List;

//interface responsavel por fazer a adição de usuarios no sistema
//o uso da interface é pensando no principio de inversao de dependencias
public interface UserService{

    void add(User user) throws Exception;
    boolean remove(int id);
    boolean update(int id, User user) throws Exception;
    List<User> list();
    User getUserByEmail(String email);
    public User getUserById(int id);



}
