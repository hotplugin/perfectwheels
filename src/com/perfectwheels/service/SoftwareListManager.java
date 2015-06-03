/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.perfectwheels.service;

import com.perfectwheels.dto.Software;
import java.util.List;

/**
 *
 * @author ShresthBirodh
 */
public class SoftwareListManager {

    List<Software> softwareList;

    public SoftwareListManager() {
    }

    public SoftwareListManager(List<Software> softwareList) {
        this.softwareList = softwareList;
    }

    public void startApplication() {
        Console console = new Console();
        console.takeUserInput();

    }

    public boolean addNewSoftware() {
        // TODO add software to the file list.
        System.out.println("inside add "+softwareList.toString());
        return true;
    }
    /* You are really going to have to do a lot of work to catch up with assignment 3 */
    /*
     TODO  Other Possible methods to be implemented in assignment 3.
     updateLicense();
     editSoftware();
     deleteSoftware();
     */

}
