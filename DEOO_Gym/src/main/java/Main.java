import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Tal coisa");
            System.out.println("2. Outra coisa");
            System.out.println("3. Sair");

            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você optou a opção 1 - Tal coisa");

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

    }
