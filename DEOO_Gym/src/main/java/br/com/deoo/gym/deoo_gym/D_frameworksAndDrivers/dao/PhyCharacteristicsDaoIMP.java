package br.com.deoo.gym.deoo_gym.D_frameworksAndDrivers.dao;


import br.com.deoo.gym.deoo_gym.A_entity.User;


public class PhyCharacteristicsDaoIMP implements PhyCharacteristicsDAO {



    @Override
    public void updateWeight(User user, double weight) {
        user.getCharacteristic().setWeight(weight);

    }

    @Override
    public void updateHeight(User user, double height) {
        user.getCharacteristic().setHeight(height);
    }

    @Override
    public void updateGoal(User user, String goal) {
        user.getCharacteristic().setPhysicalGoal(goal);

    }


}
