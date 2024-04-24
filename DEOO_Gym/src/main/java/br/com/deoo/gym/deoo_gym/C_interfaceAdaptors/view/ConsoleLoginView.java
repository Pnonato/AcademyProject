package br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.view;

import java.util.Scanner;

public class ConsoleLoginView implements UserView{
    private Scanner console = new Scanner(System.in);
    @Override
    public void showUser(String username, String email) {
        System.out.println("\t >> USUÁRIO <<");
        System.out.println("Username.............: " + username);
        System.out.println("Email................: " + email);

    }

    @Override
    public void showAlert(String message) {
        System.out.println("\t >> ATENÇÃO <<");
        System.out.println("*****************************");
        System.out.println(message);
        System.out.println("*****************************");
    }

    @Override
    public void userLoginSuccess(String username) {
        System.out.printf("Login de %s realizado com sucesso!\n", username);
    }

    @Override
    public void userLoginError(String username) {
        System.out.printf("Login inválido para %s, verifique username e senha.\n", username);
    }
    @Override
    public void userAddSucess(String username) {
        System.out.printf("Usuário cadastrado com sucesso.\n", username);
    }
    @Override
    public void userAddError(String username) {
        System.out.printf("Usuário não foi cadastrado com sucesso. Verifique email e/ou senha\n", username);
    }

    @Override
    public void userDeleteSucess() {
        System.out.printf("Usuário deletado com sucesso.\n");
    }

    @Override
    public void userDeleteError() {
        System.out.printf("Não foi possível deletar o usuário.\n");
    }

    @Override
    public String askEditionEmailUser() {
        System.out.printf("Digite o email novo:\n");
        return console.next();
    }

    @Override
    public String askEditionPasswordUser() {
        System.out.printf("Digite a senha nova:\n");
        return console.next();
    }

    @Override
    public void editSucess() {
        System.out.println("Usuário editado com sucesso");
    }

    @Override
    public void editFail() {
        System.out.println("Falha na edição do usuário. Verifique se o email e senha.");
    }
}
