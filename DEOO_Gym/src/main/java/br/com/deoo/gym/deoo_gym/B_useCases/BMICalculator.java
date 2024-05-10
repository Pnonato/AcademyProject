package br.com.deoo.gym.deoo_gym.B_useCases;

import br.com.deoo.gym.deoo_gym.A_entity.PhysicalCharacteristicsReader;

//separação da classe que calcula o Imc para seguir o principio de responsabilidade unicia e tmb tirar a logica
//de neogcios da camadada entities
public class BMICalculator {

    public double calculateBMI(PhysicalCharacteristicsReader characteristics){
        if(characteristics.getHeigth() == 0 || characteristics.getWeigth() == 0){
            throw new IllegalArgumentException("dados invalidos");
        }
        return characteristics.getWeigth() / ((characteristics.getHeigth()/100) * (characteristics.getHeigth()/100));
    }

}