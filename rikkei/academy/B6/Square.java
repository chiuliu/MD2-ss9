package rikkei.academy.B6;

public class Square implements Resizable  {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void resize(double percent) {
        side *= (1+percent)/100;

    }
    // Tính diện tích
    public double calculateArea(){
       return side*side;
    }
}