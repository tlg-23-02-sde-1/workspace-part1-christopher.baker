package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double rate;
    private double hours;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate){
        super(name, hireDate);
        setRate(rate);
    }
    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours){
        this(name, hireDate, rate); // delegate to neighboring ctor for name, hours
        setHours(hours);            // handle rate myself, by delegating to setter
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    public String toString(){
        return String.format("Hourly Employee: %s, working hard since: %s, for %s hours a week at %s an hour.", getName(), getHireDate(), getRate(), getHours());
    }
}