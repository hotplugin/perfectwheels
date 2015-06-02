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
public class Software implements Serializable{
 /* You should have access modifiers here eg private String name; */
    String name;
    String license;
    String licenseType;
    String sellerName;
    Date boughtDate;

	/* Your getters and setters must be PRIVATE */
    public Date getBoughtDate() {
        return boughtDate;
    }

    public void setBoughtDate(Date boughtDate) {
        this.boughtDate = boughtDate;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
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
    
    /* Your class needs at least one constructor and at least one public method so that other classes can access its functionality */
}
