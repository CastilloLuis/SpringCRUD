/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lcastillo.SpringCRUD.Helpers;

import java.util.Random;

/**
 *
 * @author lenri
 */
public class helpers implements HelpersInterface{

    @Override
    public int generateId() {
        Random rand = new Random();
        int id = rand.nextInt((151684 - 4) + 1) + 4;
        return id;      
    }
    
    
}
