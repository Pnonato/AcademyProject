package br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.dao;

import br.com.deoo.gym.deoo_gym.A_entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
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
    public void insert(User user) throws Exception{
            if(getUserByEmail(user.getEmail()) == null){
                 users.add(user);
        }else{
                throw new Exception("email ja existente ");
            }
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

    @Override
    public User getUserByEmail(String email) {
        for (User u: users){
            if(u.getEmail().equals(email)){
                return u;
            }
        }
        return null;
    }

    @Override
    public boolean update(User user) {
        for (int i = 0; i < users.size(); i++) {
            User currentUser = users.get(i);
            if (currentUser.getId() == user.getId()) {
                users.set(i, user);
                return true;
            }
        }
        return false;
    }

}