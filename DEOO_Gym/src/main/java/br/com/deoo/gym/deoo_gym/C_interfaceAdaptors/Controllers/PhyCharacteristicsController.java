package br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.Controllers;

import br.com.deoo.gym.deoo_gym.A_entity.User;
import br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.view.PhyCharacteristicsView;
import br.com.deoo.gym.deoo_gym.D_frameworksAndDrivers.dao.PhyCharacteristicsDaoIMP;

public class PhyCharacteristicsController {

    private PhyCharacteristicsView view;
    private PhyCharacteristicsDaoIMP dao;

    public PhyCharacteristicsController(PhyCharacteristicsView view){
        this.view = view;
        this.dao = new PhyCharacteristicsDaoIMP();
    }

    public void updateCharacteristics(User user){
        int num = view.uptadeCharacteristics();
        switch (num){
            case 1:
                updateHeight(user);
                break;
            case 2:
                updateWeight(user);
                break;
            case 3:
                updateGoal(user);
                break;
            default:
                System.out.println("Não homologado");
                break;
        }
    }
    public void updateGoal(User user){
        String msg = view.updateGoal();
        dao.updateGoal(user, msg);
    }
    public void updateWeight(User user) {
        double numb = view.updateWeight();
        dao.updateWeight(user, numb);
    }

    public void updateHeight(User user) {
        double numb = view.updateHeight();
        dao.updateHeight(user, numb);
    }



}
