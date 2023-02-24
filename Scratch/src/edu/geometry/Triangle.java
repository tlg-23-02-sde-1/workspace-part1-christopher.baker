package edu.geometry;

class Triangle extends Geometry {

//fields
    private double length;
    private double height;
    
//constructor
    public Triangle(){

    }
    public Triangle(double length, double height){
        setLength(length);
        setHeight(height);
    }

    public Triangle(String shape, double area, double length, double height) {
        super(shape, area);
        this.length = length;
        this.height = height;
    }
//business method
    
    public double area(){
        System.out.println(" The area of the Triangle is " + (getLength() * getHeight()) /2 );  // Computing area and then trashing
        return ((getLength() * getHeight()) /2);  // Computing area and then RETURNING
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