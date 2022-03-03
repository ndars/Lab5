/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author hiimd
 */
public class Freshman extends Student{
    
    public Freshman(String name, short age, int credits) {
        super(name, age, credits);
    }
    
    /**
     * Returns a string representation of this freshman.
     * @return 
     */
    @Override
    public String toString() {
        String rv = super.toString() + "\nStatus: Senior";
        return rv;
    }
}
