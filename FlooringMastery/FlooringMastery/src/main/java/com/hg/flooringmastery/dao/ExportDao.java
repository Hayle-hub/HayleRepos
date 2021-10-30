/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hg.flooringmastery.dao;

import com.hg.flooringmastery.dto.Order;

import java.util.List;

/**
 *
 * @author kristinazakharova
 */
public interface ExportDao {

    abstract void saveOrdersToFile(List<Order> allOrders) throws FlooringPersistenceException;
    
}
