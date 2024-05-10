package br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.dto;

public class PhyCharacteristicsDTO{

    private String gender;
    private String physicalGoal;
    private double IMC;
    public PhyCharacteristicsDTO( String gender, String physicalGoal, double IMC) {
        this.gender = gender;
        this.physicalGoal = physicalGoal;
        this.IMC = IMC;
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

    public double getIMC() {
        return IMC;
    } //

    @Override
    public  String toString() {
        return "monte um treino A, B, C,  para uma pessoa do sexo "
                + gender +
                "com o imc"
                + IMC +
                "e com o objetivo de" +
                " " +physicalGoal;
    }
}