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
public class Senior extends Student{

    public Senior(String name, short age, int credits) throws CreditValueException{
        super(name, age, credits);
        if(credits < 85) {
            throw new CreditValueException();
        }
    }

    /**
     * Returns a string representation of this senior.
     * @return 
     */
    @Override
    public String toString() {
        String rv = super.toString() + "\nStatus: Senior";
        return rv;
    }
    
    /**
     * A custom exception for credit value & student status mismatches.
     */
    static class CreditValueException extends Exception {

        public CreditValueException() {
            super();
        }
    }    
}
