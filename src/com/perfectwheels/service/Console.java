/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.perfectwheels.service;

import com.perfectwheels.dto.Software;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Console {

    public Console() {
    }


    /* this really isn't a properly constructed class. I know that you will be getting rid of it, but it is still good programming practice to create a proper class */
    public void takeUserInput() {
        System.out.println("Please enter Software Name");

        Scanner in = new Scanner(System.in);
        String s = in.next();

        Software software = new Software();
        software.setName(s);

    }
}
