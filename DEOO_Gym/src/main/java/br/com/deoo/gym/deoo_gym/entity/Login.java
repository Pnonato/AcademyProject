public class Login {
    private User user;
    private String password;
    // Se for passar os slides a limpo, não faz muito sentido ter User id, User name ou etc, pq são váriaveis
    // e não entidades


    public Login(User user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}