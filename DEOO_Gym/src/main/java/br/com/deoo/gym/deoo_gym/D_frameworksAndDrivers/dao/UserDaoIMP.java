package br.com.deoo.gym.deoo_gym.D_frameworksAndDrivers.dao;

import br.com.deoo.gym.deoo_gym.A_entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoIMP implements UserDAO{

    private static UserDaoIMP instance;
    private List<User> users;

    public UserDaoIMP() {
        users = new ArrayList<>();
    }
    public static UserDaoIMP getInstance() {
        if (instance == null) {
            instance = new UserDaoIMP();
        }
        return instance;

    }

    @Override
    public boolean insert(User user) {
        for (User u : users){
            if (u.getId() == user.getId()){ //verifica se ja tem um usado com o mesmo id
                return false;
            }
        }

        return users.add(user);
    }

    @Override
    public boolean delete(int id) {
       for(User u : users){
           if (u.getId() == id){
               return users.remove(u); //remove o usuario
           }
       }
       return false; //se não achar o usuario
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User getUserById(int id) {
       for (User u : users){
           if (u.getId() == id){
               return u; //retorna o usuario
           }
       }
       return null; //se não achar o usuario
    }
    // Poderiamos usar o try catch para evitar erros de exçeção
}
