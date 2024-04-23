package br.com.deoo.gym.deoo_gym.C_interfaceAdaptors;

import br.com.deoo.gym.deoo_gym.A_entity.User;
import br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.view.UserView;
import br.com.deoo.gym.deoo_gym.D_frameworksAndDrivers.dao.LoginDAO;
import br.com.deoo.gym.deoo_gym.D_frameworksAndDrivers.dao.LoginDaoIMP;
import java.util.Iterator;


public class LoginController {

     private UserView view;
    private LoginDAO dao;
     public LoginController(UserView view) {


         this.view = view;
         dao = LoginDaoIMP.getInstance();
     }


    private void login(String email, String password){

        if(dao.findUser(email, password)){
             view.showAlert(String.format("O usuário %s não está cadastrado no sistema.\n", email));
        }else{
            if(dao.findUser(email, password)){
                view.userLoginSuccess(email);
            }else {
                view.userLoginError(email);
            }
        }
    }

    private void showAll(){
        User user;
        Iterator<User> iterator = dao.getAll().iterator();
        while (iterator.hasNext()){
            user = iterator.next();
             view.showUser(user.getName(), user.getName(), user.getPassword());
        }
    }

}
