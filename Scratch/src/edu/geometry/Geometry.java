package edu.geometry;


class Geometry {
//fields
    private String shape;
    private double area;

//constructor
    public Geometry() {
    }

    public Geometry(String shape, double area) {
        setShape(shape);
        setArea(area);
    }
//business method
//helper method
//accessor method get/set/toString

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}