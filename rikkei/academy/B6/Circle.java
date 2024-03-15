package rikkei.academy.B6;

public class Circle implements  Resizable{
    private  double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public void resize(double percent) {
        radius *= (1+ percent)/100;


    }
    public double calculateArea(){
        return radius*radius*Math.PI;
    }
}
