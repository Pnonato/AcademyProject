package br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.dto;

public class PhyCharacteristicsDTO{

    private String gender;
    private String physicalGoal;
    private double IMC;
    public PhyCharacteristicsDTO( String gender, String physicalGoal) {
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
        return "create a workout A, B, C for a person of the sex"
                + gender +
//                "com o imc"
//                + IMC +
                "with the goal of" +
                " " +physicalGoal;
    }
}