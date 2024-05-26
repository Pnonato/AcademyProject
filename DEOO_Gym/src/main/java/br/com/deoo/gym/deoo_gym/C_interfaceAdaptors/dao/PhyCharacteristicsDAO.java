package br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.dao;

import br.com.deoo.gym.deoo_gym.A_entity.PhysicalCharacteristics;
import br.com.deoo.gym.deoo_gym.A_entity.User;
import br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.view.PhyCharacteristicsView;

import java.util.List;

public interface PhyCharacteristicsDAO {

    void updateHeight(User user, double height);
    void updateWeight(User user, double weight);
    void updateGoal(User user, String goal);
//    void add(PhysicalCharacteristics characteristics);
//    List<PhysicalCharacteristics> getAll();
//    PhysicalCharacteristics getById(int id);
//    void update(int id, PhysicalCharacteristics updatedCharacteristics);
//    void delete(int id);

}
