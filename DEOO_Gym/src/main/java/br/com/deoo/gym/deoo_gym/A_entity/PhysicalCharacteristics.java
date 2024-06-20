package br.com.deoo.gym.deoo_gym.A_entity;

public class PhysicalCharacteristics {

    private double weight;
    private double height;
    private String gender;
    private int age;
    private String physicalGoal; // Sugerível enum
    private double BMI;

    public PhysicalCharacteristics( double weight, double height, String gender, String physicalGoal, double BMI, int age) {
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.physicalGoal = physicalGoal;
        this.BMI = BMI;
        this.age = age;
    }
    //construtor temporario sem o bmi
    public PhysicalCharacteristics( double weight, double height, String gender, String physicalGoal,int age) {
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.physicalGoal = physicalGoal;
        this.age = age;
    }

    public PhysicalCharacteristics(double weight, double height) {
    }

    public PhysicalCharacteristics() {

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

    public void setWeight(double weight) {
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


}