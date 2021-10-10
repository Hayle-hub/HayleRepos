/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hg.vendingmachine;

import com.hg.vendingmachine.controller.VendingMachineController;
import com.hg.vendingmachine.dao.*;
import com.hg.vendingmachine.service.VendingMachineServiceLayer;
import com.hg.vendingmachine.service.VendingMachineServiceLayerImpl;
import com.hg.vendingmachine.view.UserIO;
import com.hg.vendingmachine.view.UserIOConsoleImpl;
import com.hg.vendingmachine.view.VendingMachineView;

/**
 *
 * @author kristinazakharova
 */
public class App {

    public static void main(String[] args) throws VendingMachinePersistenceException {
        UserIO iO = new UserIOConsoleImpl();
        VendingMachineView view = new VendingMachineView(iO);
        VendingMachineDao dao = new VendingMachineDaoFileImpl();
        VendingMachineAuditDao auditDao = new VendingMachineAuditDaoFileImpl();
        VendingMachineServiceLayer service = new VendingMachineServiceLayerImpl(dao, auditDao);
        VendingMachineController controller = new VendingMachineController(view, service);
        
        controller.run();
    }
}
