import br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.dto.UserDTO;

import java.awt.*;
import java.util.Scanner;

public class Util {
    private final static Scanner scanner = new Scanner(System.in);
    private final static String line = "---------------------------------";

    public static MenuOptions menu() {
        System.out.println(line);
        System.out.println("Escolha uma opção:");
        System.out.println("1. Cadastrar um usuário");
        System.out.println("2. Adicionar Treino");
        System.out.println("3. Adicionar Dieta");
        System.out.println("4. Adicionar Características Físicas");
        System.out.println("5. Mostrar Usuários");
        System.out.println("6. Mostrar Treinos");
        System.out.println("7. Mostrar Dietas");
        System.out.println("8. Mostrar Características Físicas");
        System.out.println("9. Sair do programa");
        System.out.println(line);
        System.out.print("Opção Desejada: ");

        return switch (scanner.nextInt()) {
            case 1 -> MenuOptions.ADD_USER;
            case 2 -> MenuOptions.ADD_TRAINING;
            case 3 -> MenuOptions.ADD_DIET;
            case 4 -> MenuOptions.ADD_PHYSICAL_CHARACTERISTICS;
            case 5 -> MenuOptions.SHOW_USERS;
            case 6 -> MenuOptions.SHOW_TRAININGS;
            case 7 -> MenuOptions.SHOW_DIETS;
            case 8 -> MenuOptions.SHOW_PHYSICAL_CHARACTERISTICS;
            case 9 -> MenuOptions.EXIT;
            default -> null;
        };

    }

    public static UserDTO readUser() {
        System.out.println(line);
        System.out.print("Nome: ");
        String name = scanner.next();
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.print("Senha: ");
        String password = scanner.next();
        System.out.println(line);
        return new UserDTO(name, email, password);
    }

    public static void showMessage(String message) {
        System.out.println(line);
        System.out.println(message);
        System.out.println(line);
    }

}

