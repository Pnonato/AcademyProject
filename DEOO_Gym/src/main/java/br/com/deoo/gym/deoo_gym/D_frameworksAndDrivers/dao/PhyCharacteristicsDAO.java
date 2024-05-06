package br.com.deoo.gym.deoo_gym.D_frameworksAndDrivers.dao;


import br.com.deoo.gym.deoo_gym.A_entity.User;



public interface PhyCharacteristicsDAO {



    void updateHeight(User user, double height);
    void updateWeight(User user, double weight);
    void updateGoal(User user, String goal);



}
