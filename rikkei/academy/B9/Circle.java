package rikkei.academy.B9;
// khai báo phương thức trìu tượng hình tròn
public class Circle extends Shape {

    private double radius;

   // constructor


    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*(Math.PI);
    }
// phương thức tính Area
}
