/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.perfectwheels.service;

import com.perfectwheels.dto.Employee;
import com.perfectwheels.dto.Software;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ShresthBirodh
 */
public class EmployeeManager {

    public EmployeeManager() {
    }
    public static List<Employee> employeeList;

    public void buildEmployeeList(File employeeFile) throws FileNotFoundException {
        Scanner s = new Scanner(employeeFile);
        employeeList = new ArrayList<Employee>();
        while (s.hasNext()) {
            String[] data = s.nextLine().split(",");
            Employee employee = new Employee();
            employee.setId(Integer.parseInt(data[0]));
            employee.setName(data[1]);
            employee.setAddress(data[2]);
            employee.setPhone(data[3]);
            employee.setDepartment(data[4]);
            employeeList.add(employee);
        }
    }

}
