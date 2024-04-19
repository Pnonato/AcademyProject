package br.com.deoo.gym.deoo_gym.D_frameworksAndDrivers.dao;

import br.com.deoo.gym.deoo_gym.A_entity.PhysicalCharacteristics;

import java.util.ArrayList;
import java.util.List;

public class PhyCharacteristicsDaoIMP {
    private List<PhysicalCharacteristics> characteristicsList;

    public PhyCharacteristicsDaoIMP() {
        this.characteristicsList = new ArrayList<>();
    }

    public List<PhysicalCharacteristics> getAll() {
        return characteristicsList;
    }

    public void addCharacteristics(PhysicalCharacteristics characteristics) {
        if(characteristics != null){
            characteristicsList.add(characteristics);
        }
    }

    public void updateCharacteristics(PhysicalCharacteristics updatedCharacteristics) {
        for (int i = 0; i < characteristicsList.size(); i++) {
            PhysicalCharacteristics characteristics = characteristicsList.get(i);
            if (characteristics.getGender().equals(updatedCharacteristics.getGender())) {
                // Atualizar as características físicas com base no gênero (pode ser necessário adicionar mais critérios de comparação)
                characteristicsList.set(i, updatedCharacteristics);
                return;
            }
        }

    }

    public void deleteCharacteristics(String gender) {
        characteristicsList.removeIf(characteristics -> characteristics.getGender().equals(gender));

    }
}
