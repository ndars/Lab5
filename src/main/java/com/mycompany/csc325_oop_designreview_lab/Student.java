
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab, ndars
 */
public class Student extends Human{
    
    protected double gpa; // the student's grade point average
    protected int credits; // the student's earned credits

    public Student(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
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

    /**
     * Returns a string representation of this student.
     * @return 
     */
    @Override
    public String toString() {
        String rv = String.format("%s, age %d%nAddress: %s%nGPA: %.2f%nCredits: %d", name, age, address, gpa, credits);
        return rv;
    }
}