/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

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
		
            System.out.println(std1);

            System.out.println(std2);

            // ToDo 12: add comments and explain your code

            // ToDo 13: submit using a pull request.
	}

}