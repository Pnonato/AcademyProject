//package br.com.deoo.gym.deoo_gym.B_useCases;
//
//import br.com.deoo.gym.deoo_gym.A_entity.PhysicalCharacteristics;
//import org.springframework.context.annotation.Bean;
//
//
//public class BMICalculator {
//
//    public double calculateBMI(PhysicalCharacteristics characteristics){
//        if(characteristics.getHeight() == 0 || characteristics.getWeight() == 0){
//            throw new IllegalArgumentException("dados invalidos");
//        }
//        double heightInMeters = characteristics.getHeight() / 100.0;
//        return characteristics.getWeight() / (heightInMeters * heightInMeters);
//    }
//}