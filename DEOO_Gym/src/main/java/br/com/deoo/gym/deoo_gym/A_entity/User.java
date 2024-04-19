package br.com.deoo.gym.deoo_gym.A_entity;
public class User{
    private int id;
    private String name;
    private String email;
    private String password;
    private int count;
    private PhysicalCharacteristics characteristic;

    private Training training;

    private User(){
        this.id = ++count;
    }
    public User(String name, String email, String password, PhysicalCharacteristics characteristic, Training training) {
        this();
        this.name = name;
        this.email = email;
        this.password = password;
        this.characteristic = characteristic;
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

    public PhysicalCharacteristics getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(PhysicalCharacteristics characteristic) {
        this.characteristic = characteristic;
    }

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }
}