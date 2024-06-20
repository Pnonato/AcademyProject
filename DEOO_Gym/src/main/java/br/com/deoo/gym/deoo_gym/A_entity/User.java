package br.com.deoo.gym.deoo_gym.A_entity;
public class User{
    private int id;
    private String name;
    private String email;
    private String password;
    private static int count = 0;
    private PhysicalCharacteristics characteristics;
    private Training training;

    public User(){
        this.id = ++count;
    }
    public User(String name, String email, String password){
        this();
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public User(String name, String email, String password, PhysicalCharacteristics characteristics, Training training) {
        this();
        this.name = name;
        this.email = email;
        this.password = password;
        this.characteristics = characteristics;
        this.training = training;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PhysicalCharacteristics getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(PhysicalCharacteristics characteristics) {
        this.characteristics = characteristics;
    }

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }

}