package edu.geometry;

public abstract class Geometry {

//fields
    private String shape;
    private double area;
    private double perimeter;

//constructor
    public Geometry() {
    }
    public Geometry(String shape){
        this();
        getShape();
    }
    public Geometry(String shape, double area) {
        this(shape);
        setArea(area);
    }

//business method
    public abstract void area (); //I want java to understand that area will change from subclass to subclass

//helper method
//accessor method get/set/toString

    public String getShape() {
        return shape;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getArea() {
        return area;
    }
    public double getPerimeter() {
        return perimeter;
    }
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "Geometry{" +
                "shape='" + shape + '\'' +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}