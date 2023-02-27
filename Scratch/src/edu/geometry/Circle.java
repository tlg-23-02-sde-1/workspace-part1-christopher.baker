package edu.geometry;

import static java.lang.Math.PI;
import static java.lang.Math.pow;


class Circle extends Geometry {
//fields
    private double radius;
    private double area;

//constructor
    public Circle() {
        super();
    }
    public Circle(String shape) {
        super(shape);
    }
    public Circle(String shape, double area) {
        super(shape);
        this.area = area;
    }
    public Circle(String shape, double area, double radius){
        super(shape);
        this.area = area;
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
    public double getArea(){
        return area;
    }
    public void setArea(double area) {
        this.area = (PI * pow(getRadius(),2));
    }
}
