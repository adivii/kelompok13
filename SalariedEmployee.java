package salariedemploye;

public class SalariedEmployee extends Employee{
    private int Salary;
    private int salary;

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary){
    this.salary = salary;

    }

    @Override
    int payment() {
    return this.salary;
    }

}