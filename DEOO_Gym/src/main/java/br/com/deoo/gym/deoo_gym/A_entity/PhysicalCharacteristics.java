package br.com.deoo.gym.deoo_gym.A_entity;

public class PhysicalCharacteristics {

    private double weight;
    private double height;
    private String gender;
    private int age;
    private String physicalGoal; // Sugerível enum
    private double IMC;


    public PhysicalCharacteristics( double weight, double height, String gender, String physicalGoal, double IMC, int age) {
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.physicalGoal = physicalGoal;
        this.IMC = IMC;
        this.age = age;
    }

    //uso do this para deixar claro que as referencias estao sendo feitas a partir da classe atual
    public double calculateIMC() {
        this.IMC = this.weight / ((this.height/100) * (this.height/100));
        return this.IMC;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeighth(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhysicalGoal() {
        return physicalGoal;
    }

    public void setPhysicalGoal(String physicalGoal) {
        this.physicalGoal = physicalGoal;
    }


    public void setIMC(double IMC) {
        this.IMC = IMC;
    }
}