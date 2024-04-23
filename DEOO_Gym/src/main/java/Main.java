import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar um usuário");
            System.out.println("2. Realizar login");
            System.out.println("3. ");

            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a opção 1 - Cadastrar um usuário");


                    break;
                case 2:
                    System.out.println("Você escolheu a opção 2 - Outra coisa");

                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }

    public static class Utils {


    }
}
