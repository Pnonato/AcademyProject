package br.com.deoo.gym.deoo_gym.D_frameworksAndDrivers.dao;

import br.com.deoo.gym.deoo_gym.A_entity.PhysicalCharacteristics;

import java.util.List;

public interface PhyCharacteristicsDAO {


    List<PhysicalCharacteristics> getAll();
    void addCharacteristics(PhysicalCharacteristics characteristics);
    void updateCharacteristics(PhysicalCharacteristics updatedCharacteristics);
    void deleteCharacteristics(String gender);

}
