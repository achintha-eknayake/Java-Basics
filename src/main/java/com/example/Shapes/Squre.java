package com.example.Shapes;

public class Squre {

    private double length;

    public Squre(double lenght) {
        this.length = lenght;
    }

    public double getArea() {
        return length * length;
    }

    public double getPerimeter() {
        return 2 * length;
    }

    @Override
    public String toString(){
        return String.format(
                "Shape: Squre\n" +
                        "\n" +
                        "Properties:\n" +
                        "Length = %.2f\n" +
                        "\n" +
                        "Area = %.2f\n" +
                        "Perimeter = %.2f",length,getArea(),getPerimeter()
        );
    }

}
