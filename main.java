/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kelompok;

/**
 *
 * @author Asus-FX505DY
 */
public class main {
    public static void main(String[] args) {
	Employee[] emp = new Employee[2];
        SalariedEmployee sal = new SalariedEmployee();
        HourlyEmployee hour = new HourlyEmployee();
        
        
//        emp [0] = new SalariedEmployee();
//        emp [1] = new HourlyEmployee();
        
        emp [0] = sal;
        emp [1] = hour;
        
        sal.setSalary(6);
        hour.setHoursWorked(7);
        hour.setHourlyPayment(50);
        



        for(Employee i : emp ){
            System.out.println(i.payment());
        }
    }
    
}
