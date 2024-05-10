//package br.com.deoo.gym.deoo_gym.B_useCases;
//
//import br.com.deoo.gym.deoo_gym.A_entity.User;
//import br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.dao.UserDAO;
//
//public class UserServiceImpl implements UserService {
//
//    private final UserDAO userDAO;
//
//    public UserServiceImpl(UserDAO userDAO) {
//        this.userDAO = userDAO;
//    }
//
//    @Override
//    public User authenticateUser(String email, String password) {
//        return new LoginImpl(userDAO).authenticateUser(email, password);
//    }
//
//    @Override
//    public void addUser(String name, String email, String password) {
//
//        User user = new User();
//        user.setName(name);
//        user.setEmail(email);
//        user.setPassword(password);
//
//        userDAO.insert(user);
//    }
//}