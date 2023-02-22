package edu.geometry;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

class Circle extends Geometry {
    public Circle() {
    }

    public Circle(String shape, double area) {
        super(shape, area);
    }
//fields
    private double radius;

//constructor
    public Circle(double radius){
        setRadius(radius);
    }
//business method
    public double area(){
        System.out.println(" The area of the Circle is " + (PI * pow(getRadius(), 2)));
        return (PI * pow(getRadius(), 2));
    }


//helper method
//accessor method get/set/toString

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}