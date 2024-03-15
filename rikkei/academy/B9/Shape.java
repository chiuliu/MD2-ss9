package rikkei.academy.B9;
// khai báo 1 phương thức trìu tượng

public abstract class Shape {
public String color;
// constructor
public Shape(){}
    public Shape(String color) {
        this.color = color;
    }
    // getter setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
//Phương thức trừu tượng tính diễn tích
    public abstract double getArea();

    // phương thức display hiển thị màu sắc
    public  void  displayData(){
        System.out.println("Màu sắc của hình là : " + color);
    }

}
