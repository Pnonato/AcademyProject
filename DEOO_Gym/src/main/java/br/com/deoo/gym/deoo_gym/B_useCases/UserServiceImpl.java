//package br.com.deoo.gym.deoo_gym.B_useCases;
//
//
//import br.com.deoo.gym.deoo_gym.A_entity.User;
//import br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.dao.UserDAO;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class UserServiceImpl  {
//
//    @Autowired
//    private UserDAO userDAO;
//
//    public List<User> findAll() {
//        return userDAO.getAll();
//    }
//
//    public User findById(int id) {
//        return userDAO.getById(id);
//    }
//
//    public void save(User user) {
//        userDAO.add(user);
//    }
//
//    public void update(int id, User updatedUser) {
//        userDAO.update(id, updatedUser);
//    }
//
//    public void deleteById(int id) {
//        userDAO.delete(id);
//    }
//}
