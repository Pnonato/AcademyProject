package br.com.deoo.gym.deoo_gym.C_interfaceAdaptors;

import br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.view.PhyCharacteristicsView;
import br.com.deoo.gym.deoo_gym.D_frameworksAndDrivers.dao.PhyCharacteristicsDaoIMP;

public class PhyCharacteristicsController {

    private PhyCharacteristicsView view;
    private PhyCharacteristicsDaoIMP dao;

    public PhyCharacteristicsController(PhyCharacteristicsView view){
        this.view = view;
        this.dao = new PhyCharacteristicsDaoIMP();
    }




}
