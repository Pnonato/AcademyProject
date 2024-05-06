import br.com.deoo.gym.deoo_gym.A_entity.User;
import br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.Controllers.LoginController;
import br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.view.ConsoleLoginView;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        ConsoleLoginView view = new ConsoleLoginView();
        LoginController controller = new LoginController(view);
        User testeUsuario = new User("Rivaldo", "rivaldoReiDelas@gmail.com", "xlr8");
        User testeUsuario2 = new User("Genova", "rivaldoReiDelas12@gmail.com", "xlr8");
        User testeUsuario3 = new User("Beta", "rivaldoReiDelas123@gmail.com", "xlr8");

        controller.addUser(testeUsuario);
        controller.addUser(testeUsuario2);
        controller.addUser(testeUsuario3);

        MenuOptions teste = Util.menu();

        Scanner busca = new Scanner(System.in);
        teste = MenuOptions.valueOf(busca.nextInt());

        do {
            switch (teste) {
                case ADD_USER:
                    controller.addUser(testeUsuario);

                    break;
                case ADD_TRAINING:
                    System.out.println(teste.getDescription());
                    break;
                case ADD_DIET:
                    System.out.println(teste.getDescription());
                    break;
                case ADD_PHYSICAL_CHARACTERISTICS:
                    System.out.println(teste.getDescription());
                    break;
                case SHOW_USERS:
                    controller.showAll();
                    break;
                case SHOW_TRAININGS:
                    System.out.println(teste.getDescription());
                    break;
                case SHOW_DIETS:
                    System.out.println(teste.getDescription());
                    break;
                case SHOW_PHYSICAL_CHARACTERISTICS:
                    System.out.println(teste.getDescription());
                    break;
                case EXIT:
                    System.out.println(teste.getDescription());
                    break;
                default:
                    System.out.println(teste.getDescription());
                    break;
            }
        } while (teste.getValue() < 0 || teste.getValue() > 9);


    }


}
