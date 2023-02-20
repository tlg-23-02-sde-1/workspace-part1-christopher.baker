package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);  // delegate to superclass ctor for name, hireDate
                                //register in 401K
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary){
        this(name, hireDate);   // delegate to neighboring ctor for name, hireDate
        setSalary(salary);      // handle rate myself, by delegating to setter
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString(){
        return String.format("Salaried Employee: %s, working hard since: %s, earning a salary of %sk a year.", getName(), getHireDate(), getSalary());
    }
}