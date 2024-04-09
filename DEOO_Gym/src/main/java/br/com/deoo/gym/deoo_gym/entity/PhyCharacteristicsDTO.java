package br.com.deoo.gym.deoo_gym.interfaceAdaptors.dto;

public class PhyCharacteristicsDTO{


    //    private double weight;
    //    private double height;
    private String gender;
    private String physicalGoal;
    private double IMC;
    public PhyCharacteristicsDTO( double weight, double height, String gender, String physicalGoal, double IMC) {

//        this.weight = weight;
//        this.height = height;
        this.gender = gender;
        this.physicalGoal = physicalGoal;
        this.IMC = IMC;
    }

//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double weight) {
//        this.weight =weight;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public void setHeight(double height) {
//        this.height = height;
//    }

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
    //retorna o imc que é calculado na classe physicalCharacteristics - entidade
    public double getIMC() {
        return IMC;
    }

}

