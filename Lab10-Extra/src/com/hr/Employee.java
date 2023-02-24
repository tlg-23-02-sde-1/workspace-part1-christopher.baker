package com.hr;
import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS

    // Option 4 try-catch, but then throw a different one.
    // We are "nesting" the underlying 'cause' exception into a higher-level,
    // More HR-oriented
    public void goToWork() throws WorkException{
        Car a = new Car("8675309", "Tesla", "Model X");
        a.start();
        try {
            a.moveTo("West Seattle");
        }
        catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work", e);

        }
        finally {
            a.stop();
        }
        System.out.println("Arrived at work");
    }
/*

        Option 1
    public void goToWork() throws DestinationUnreachableException{
        Car a = new Car("8675309", "Tesla", "Model X");
        try {
            a.start();
            a.moveTo("West Seattle");
            a.stop();
            System.out.println("Arrived at work");
        } catch (DestinationUnreachableException e) {
            System.out.println(e.getMessage());
        }
        finally {
            a.stop();
        }

        Option 2
    public void goToWork() throws DestinationUnreachableException{
        Car a = new Car("8675309", "Tesla", "Model X");
        a.start();
        try {
            a.moveTo("West Seattle");
        }
        finally {
            a.stop();
        }
        System.out.println("Arrived at work");
    }
        Option 3, try-catch, "respond" in some way, and then re-throw.
        "catch-and-rethrow"
    public void goToWork() throws DestinationUnreachableException{
        Car a = new Car("8675309", "Tesla", "Model X");
        a.start();
        try {
            a.moveTo("West Seattle");
        }
        catch (DestinationUnreachableException e) {
            System.out.println("Email Lisa Herbold to complain");
            throw e;
        }
        finally {
            a.stop();
        }
        System.out.println("Arrived at work");
    }

*/
    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}