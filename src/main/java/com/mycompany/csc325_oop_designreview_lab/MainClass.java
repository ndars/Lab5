/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab, ndars
 */
public class MainClass {
	
    public static void main(String[] args) {		                                
        Student std1= new Freshman("James", (short)20, 12); // name, age, credits
        Student std2;
        try {
            std2 = new Senior("John", (short)30, 90);
        } catch (Senior.CreditValueException ex) {
            std2 = new Freshman("John", (short)30, 90); // instantiates a freshman instead
        }
        inputGpa(std1);
        inputGpa(std2);
        System.out.println(std1 + "\n");
        System.out.println(std2);
    }
    
    /**
     * Sets a student's GPA to a user-input GPA value.
     * @param std The student whose GPA will be modified
     */
    private static void inputGpa(Student std) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter " + std.getName() + "'s GPA.");
        String strGpa = keyboard.nextLine();
        double gpa = Double.parseDouble(strGpa);
        std.setGpa(gpa);
    }
}