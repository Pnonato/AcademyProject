package br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.DAOImpl;


import br.com.deoo.gym.deoo_gym.A_entity.Enuns.PhysicalGoal;
import br.com.deoo.gym.deoo_gym.A_entity.User;
import br.com.deoo.gym.deoo_gym.B_useCases.DAOInterfaces.PhyCharacteristicsDAO;


public class PhyCharacteristicsDAOImpl implements PhyCharacteristicsDAO {

    @Override
    public void updateWeight(User user, double weight) {
        user.getCharacteristics().setWeight(weight);

    }
    @Override
    public void updateHeight(User user, double height) {
        user.getCharacteristics().setHeight(height);
    }

    @Override
    public void updateGoal(User user, String physicalGoal) {
        user.getCharacteristics().setPhysicalGoal(PhysicalGoal.valueOf(physicalGoal)); /////////////
    }
}
