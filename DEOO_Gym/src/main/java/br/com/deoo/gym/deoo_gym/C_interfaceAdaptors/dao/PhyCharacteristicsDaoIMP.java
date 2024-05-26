package br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.dao;


import br.com.deoo.gym.deoo_gym.A_entity.User;


public class PhyCharacteristicsDaoIMP implements PhyCharacteristicsDAO {

    @Override
    public void updateWeight(User user, double weight) {
        user.getCharacteristics().setWeight(weight);

    }
    @Override
    public void updateHeight(User user, double height) {
        user.getCharacteristics().setHeight(height);
    }

    @Override
    public void updateGoal(User user, String goal) {
        user.getCharacteristics().setPhysicalGoal(goal);

    }

}
