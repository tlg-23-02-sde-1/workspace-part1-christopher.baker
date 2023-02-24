package edu.geometry;

class Square extends Geometry{
//fields
    private double length;
    private double area;
//constructor

    public Square(){
    }
    public Square(String shape){
        super(shape);
    }
    public Square(String shape, double length){
        super(shape);
        this.length = length;
    }
    public Square(String shape, double length, double area){
        super(shape);
        this.length = length;
        this.area = area;
    }

//business method

//helper method
//accessor method get/set/toString

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = 4 * length;
    }
}