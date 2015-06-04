/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.perfectwheels.service;

import com.perfectwheels.dto.Software;
import com.perfectwheels.ui.StartApp;
import java.util.List;

/**
 *
 * @author Dell
 */
public class ReportsManager {

    List<Software> s;

    public void getAllSoftwareList() {
        
        s = StartApp.softwareList;
System.out.println("reportmanager softwarelist "+s.toString());
    }
}
