package com.example.Shapes;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString(){
        return String.format(
                "Shape: Circle\n" +
                        "\n" +
                        "Properties:\n" +
                        "Radius = %.2f\n" +
                        "\n" +
                        "Area = %.2f\n" +
                        "Perimeter = %.2f",radius,getArea(),getPerimeter());
    }
}
