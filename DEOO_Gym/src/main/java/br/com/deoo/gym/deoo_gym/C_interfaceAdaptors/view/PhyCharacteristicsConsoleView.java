package br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.view;

import br.com.deoo.gym.deoo_gym.A_entity.User;

import java.util.Scanner;

public class PhyCharacteristicsConsoleView implements PhyCharacteristicsView {
    private Scanner teste = new Scanner(System.in);

    @Override
    public void showCharacteristics(User user) {
        System.out.println("|---------------------------------------------|");
        System.out.println("|**--  Caracteristicas Físicas do " + user.getName() + "--**|");
        System.out.println("|---------------------------------------------|");
        System.out.println("| Nome: " + user.getName());
        System.out.println("| Idade: " + user.getCharacteristics().getAge());
        System.out.println("| Gênero: " + user.getCharacteristics().getGender());
        System.out.println("| Peso: " + user.getCharacteristics().getWeight());
        System.out.println("| Altura: " + user.getCharacteristics().getHeight());
//        System.out.println("| IMC: " + user.getCharacteristics().calculateIMC());
        System.out.println("| Meta: " + user.getCharacteristics().getPhysicalGoal());
        System.out.println("|---------------------------------------------");

    }

    @Override
    public void showAlert(String message) {
        System.out.println("******* ATENÇÃO ********");
        System.out.println(message);
        System.out.println("************************");
    }

    @Override
    public int uptadeCharacteristics() {

        int i;
        do {
            System.out.println("O que você gostaria de atualizar?");
            System.out.println("1 - Altura");
            System.out.println("2 - Peso");
            System.out.println("3 - Meta");
            System.out.println("0 - Sair");
            i = teste.nextInt();
        } while (i < 0 || i > 3);
        return i;
    }

    @Override
    public String updateGoal() {
        String msg;
        System.out.println("Qual sua nova meta?");
        return msg = teste.next();
    }

    @Override
    public double updateHeight() {
        double numb;
        System.out.println("Qual sua nova Altura?");
        return numb = teste.nextDouble();
    }

    @Override
    public double updateWeight(){
        double numb;
        System.out.println("Qual seu novo Peso?");
        return numb = teste.nextDouble();
    }


}
