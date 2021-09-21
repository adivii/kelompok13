/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adiha
 */
public class HourlyEmployee extends Employee{
    private int hoursWorked;
    private int hourlyPayment;
    
    /**
     * @return the hoursWorked
     */
    public int getHoursWorked() {
        return hoursWorked;
    }

    /**
     * @param hoursWorked the hoursWorked to set
     */
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    /**
     * @return the hourlyPayment
     */
    public int getHourlyPayment() {
        return hourlyPayment;
    }

    /**
     * @param hourlyPayment the hourlyPayment to set
     */
    public void setHourlyPayment(int hourlyPayment) {
        this.hourlyPayment = hourlyPayment;
    }    
    
    @Override
    int payment() {
        return this.hourlyPayment*this.hoursWorked;
    }
}
