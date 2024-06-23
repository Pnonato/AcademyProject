package br.com.deoo.gym.deoo_gym.B_useCases;

import br.com.deoo.gym.deoo_gym.A_entity.User;
import br.com.deoo.gym.deoo_gym.B_useCases.DAOInterfaces.PhyCharacteristicsDAO;

public class PhyCharacteristicsService {

    private final PhyCharacteristicsDAO characteristicsDAO;

    public PhyCharacteristicsService( PhyCharacteristicsDAO characteristicsDAO){
        this.characteristicsDAO = characteristicsDAO;
    }

    public void updateGoal(User user, String physicalGoal){
        if(user != null & user.getCharacteristics() != null) { //
            characteristicsDAO.updateGoal(user, physicalGoal);
        }
    }
    public void updateWeight(User user, double weight) {
        if(user != null && user.getCharacteristics() != null) {
            characteristicsDAO.updateWeight(user, weight);
        }
    }

    public void updateHeight(User user, double height) {
        if(user != null && user.getCharacteristics() != null){
            characteristicsDAO.updateHeight(user, height);
        }
    }
}
