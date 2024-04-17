package br.com.deoo.gym.deoo_gym.D_frameworksAndDrivers.dao;

import br.com.deoo.gym.deoo_gym.A_entity.User;

import java.util.List;

public interface LoginDAO {


    boolean addUser(User usuario);
    boolean findUser(String email, String senha);
    boolean findUser(int id);
    boolean editUser(String email, String senha, String novaSenha, String novoE);

    boolean deleteUser(String email, String senha);
    boolean deleteUser(int id);
    User findUser(int id, List<User> listaDeUsers);





}
