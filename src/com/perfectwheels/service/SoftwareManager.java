/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.perfectwheels.service;

import com.perfectwheels.dto.Software;
import com.perfectwheels.ui.StartApp;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ShresthBirodh
 */
public class SoftwareManager {

    public SoftwareManager() {
    }
    public static List<Software> softwareList;

    public void startApplication() {
        Console console = new Console();
        console.takeUserInput();

    }

    public void buildSoftwareList(File softwareFile) throws FileNotFoundException {
        Scanner s = new Scanner(softwareFile);
        softwareList = new ArrayList<Software>();
        while (s.hasNext()) {
            //  System.out.println("READ: " + s.nextLine());
            String[] data = s.nextLine().split(",");
            Software software = new Software();
            software.setId(Integer.parseInt(data[0]));
            software.setName(data[1]);
            software.setLicenseType(data[2]);
            software.setLicenseNo(data[3]);
            softwareList.add(software);
        }
    }

    /* You are really going to have to do a lot of work to catch up with assignment 3 */
    /*
     TODO  Other Possible methods to be implemented in assignment 3.
     updateLicense();
     editSoftware();
     deleteSoftware();
     */
}
