package br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.view;

public interface UserView {

    void showUser(String username, String name);

    void showAlert(String message);

    void userLoginSuccess(String username);

    void userLoginError(String username);

    void userAddSucess(String username);

    void userAddError(String username);

    void userDeleteSucess();

    void userDeleteError();

    String askEditionEmailUser();
    String askEditionPasswordUser();

    void editSucess();

    void editFail();
}
