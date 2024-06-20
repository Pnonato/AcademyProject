package br.com.deoo.gym.deoo_gym.B_useCases;

import br.com.deoo.gym.deoo_gym.A_entity.User;
import br.com.deoo.gym.deoo_gym.B_useCases.DAOInterfaces.UserDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    @Override
    public void add(User user) throws Exception{
        if(isUserValid(user)){
            userDAO.insertUser(user);
        }else{
            throw new Exception("error adding user");
        }
    }

    @Override
    public boolean remove(int id) {
        return userDAO.delete(id);
    }

    @Override
    public boolean update(int id, User user) throws Exception{
        if(isUserValid(user)){
            userDAO.updateUser(id, user);
            return true;
        }else{
            throw new Exception("error when updating user");
        }
    }

    @Override
    public List<User> list() {
        return userDAO.getAllUsers();
    }

    @Override
    public User getUserByEmail(String email){
        return userDAO.getUserByEmail(email);
    }

    @Override
    public User getUserById(int id){
        return userDAO.getUserById(id);
    }

    private boolean isUserValid(User user){
        if(userDAO.getUserByEmail(user.getEmail()) != null){
            return false;
        }
        if(user.getPassword().length() < 6){
            return false;
        }
        if(user.getName().length() < 3){
            return false;
        }
        return true;
    }

}
