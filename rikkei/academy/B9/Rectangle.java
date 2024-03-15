package rikkei.academy.B9;

public class Rectangle extends Shape  {
    private double width;
    private double height;

    //constructor

    public Rectangle(double width,String color, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }


    @Override
    public double getArea() {
        return width*height;
    }
}
