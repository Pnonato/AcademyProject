package br.com.deoo.gym.deoo_gym.A_entity;

import br.com.deoo.gym.deoo_gym.A_entity.Enuns.Gender;
import br.com.deoo.gym.deoo_gym.A_entity.Enuns.PhysicalGoal;

public class PhysicalCharacteristics {

    private double weight;
    private double height;
    private Gender gender;
    private int age;
    private PhysicalGoal physicalGoal;
    private double BMI;

    public PhysicalCharacteristics( double weight, double height, Gender gender, PhysicalGoal physicalGoal, double BMI, int age) {
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.physicalGoal = physicalGoal;
        this.BMI = BMI;
        this.age = age;
    }
    //construtor temporario sem o bmi
    public PhysicalCharacteristics( double weight, double height, Gender gender, PhysicalGoal physicalGoal,int age) {
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public PhysicalGoal getPhysicalGoal() {
        return physicalGoal;
    }

    public void setPhysicalGoal(PhysicalGoal physicalGoal) {
        this.physicalGoal = physicalGoal;
    }


}