/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.perfectwheels.service;

import com.perfectwheels.service.Console;
import com.perfectwheels.service.SoftwareManager;
import java.util.Scanner;

/**
 *
 * @author ShresthBirodh
 */
public class PerfectWheels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("WELCOME TO PERFECTWHEELS!");
        SoftwareManager listManager = new SoftwareManager();
        listManager.startApplication();

    }

}
