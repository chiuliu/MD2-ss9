package rikkei.academy.B6;

public class Rectangle implements Resizable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize(double percent) {
        width *= (1+percent)/100;
        height *= (1+percent)/100;

    }
    // Tính dien tich
    public double calculateArea(){
       return width*height;
    }


}
