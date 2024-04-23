package br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.view;

public interface UserView {

    void showUser(String username, String name, String password);

    void showAlert(String message);

    void userLoginSuccess(String username);

    void userLoginError(String username);
}
