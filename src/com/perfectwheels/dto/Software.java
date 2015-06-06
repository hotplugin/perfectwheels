/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.perfectwheels.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author ShresthBirodh
 */
public class Software implements Serializable {
    /* You should have access modifiers here eg private String name; */

    int id;
    String name;
    String licenseNo;
    String licenseType;
    String sellerName;
    Date boughtDate;

    public Software(){}
    /* Your getters and setters must be PRIVATE */
    public String toString() {
        return "Name: " + name + " | licenseNo: " + licenseNo;
    }
    
    /* Your class needs at least one constructor and at least one public method so that other classes can access its functionality */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Date getBoughtDate() {
        return boughtDate;
    }

    public void setBoughtDate(Date boughtDate) {
        this.boughtDate = boughtDate;
    }
}
