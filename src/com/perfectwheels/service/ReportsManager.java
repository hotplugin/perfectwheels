/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.perfectwheels.service;

import com.perfectwheels.dto.Employee;
import com.perfectwheels.dto.Software;
import com.perfectwheels.ui.StartApp;
import java.util.List;

/**
 *
 * @author ShresthBirodh
 */
public class ReportsManager {

    List<Software> softwares;
    List<Employee> employees;

    
    public List<Software> getAllSoftwareList() {

        softwares = SoftwareManager.softwareList;
        System.out.println("report softwares: "+softwares.toString());
        return softwares;
    }

    public List<Employee> getAllEmployeeList() {

        employees = EmployeeManager.employeeList;
        System.out.println("report employees "+employees.toString());
        return employees;
    }
}
