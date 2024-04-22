package br.com.deoo.gym.deoo_gym.C_interfaceAdaptors;

import br.com.deoo.gym.deoo_gym.A_entity.User;
import br.com.deoo.gym.deoo_gym.D_frameworksAndDrivers.dao.UserDAO;
import br.com.deoo.gym.deoo_gym.D_frameworksAndDrivers.dao.UserDaoIMP;

import java.util.List;

public class UserController {
    // private UserView view;
    private UserDAO dao;
    public UserController() {
        // this.view = view;
        dao = UserDaoIMP.getInstance();
    }

    public boolean insertUser(User user){
        return dao.insert(user);
    }

    public boolean deleteUser(int id){
        return dao.delete(id);
    }

    public User getUserById(int id){
        return dao.getUserById(id);
    }

    public List<User> getAllUsers(){
        return dao.getAllUsers();
    }

}
