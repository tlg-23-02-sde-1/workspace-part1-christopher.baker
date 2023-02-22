package edu.geometry;

class Rectangle extends Geometry {

//fields
    private double length;
    private double height;
//constructor
    public Rectangle(double length, double height){
        setLength(length);
        setHeight(height);
    }

//business method
    public double area(){
        System.out.println(" The area of the rectangle is " + getLength() * getHeight());  
        return getLength() * getHeight();
    }
//helper method
//accessor method get/set/toString

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}