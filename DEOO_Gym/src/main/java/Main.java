import br.com.deoo.gym.deoo_gym.A_entity.User;
import br.com.deoo.gym.deoo_gym.D_frameworksAndDrivers.dao.LoginDaoIMP;

public class Main {
    public static void main(String[] args) {


        User testeUsuario = new User("Rivaldo", "rivaldoReiDelas@gmail.com", "xlr8");
        MenuOptions teste = Util.menu();
        do {

            switch (teste) {
                case ADD_USER:
                    if (LoginDaoIMP.getInstance().addUser(testeUsuario)){
                        System.out.println("Passou");

                    }else{
                        System.out.println("Nao passou");
                    }

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
                    System.out.println(teste.getDescription());
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
        } while (teste.getValue() != 9);


    }


}
