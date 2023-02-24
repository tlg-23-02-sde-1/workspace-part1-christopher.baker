package edu.geometry;

class Rectangle extends Geometry {

//fields
    private double length;
    private double height;
    private double area;
    private double perimeter;

//constructor
    public Rectangle(){
    }
    public Rectangle(String shape){
        super(shape);
    }
    public Rectangle(String shape, double length){
        super(shape);
        this.length = length;
    }
    public Rectangle(String shape, double length, double height){
        super(shape);
        this.length = length;
        this.height = height;
    }
    public Rectangle(String shape, double length, double height, double area) {
        super(shape);
        this.length = length;
        this.height = height;
        this.area = area;
    }
    public Rectangle(String shape, double length, double height, double area, double perimeter) {
        super(shape);
        this.length = length;
        this.height = height;
        this.area = area;
        this.perimeter = perimeter;
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
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getArea(){
        return area;
    }
    @Override
    public void setArea(double area){
        this.area = height * length;
    }
    @Override
    public double getPerimeter() {
        return perimeter;
    }
    @Override
    public void setPerimeter(double perimeter) {
        this.perimeter = 2*length + 2*height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", height=" + height +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}