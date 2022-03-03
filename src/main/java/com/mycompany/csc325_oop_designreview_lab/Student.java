
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab, ndars
 */
public class Student extends Human{
    
    protected double gpa; // the student's grade point average

    public Student(String name, short age) {
        super(name, age);
    }

    /**
     * Returns the student's grade point average.
     * @return 
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * Sets the student's grade point average to the given double.
     * @param gpa 
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    /**
     * Returns the student's address.
     * @return 
     */
    @Override
    public String getAddress() {
        return address;
    }

    /**
     * Sets the student's address to the given String.
     * @param address 
     */
    @Override
    public void setAddress(String address) {
        this.address = address;
    }


}