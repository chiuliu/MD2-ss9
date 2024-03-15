package rikkei.academy.B9;

import rikkei.academy.B9.Circle;
import rikkei.academy.B9.Rectangle;
import rikkei.academy.B9.Shape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 4.2);

        System.out.println("Hình chữ nhật :");
        Shape hinhChuNhat = new Rectangle(2.3, "blue", 3.5);
        hinhChuNhat.getArea();
        System.out.println("có diên tích là :" + hinhChuNhat.getArea());// gọi tính dt
        hinhChuNhat.displayData();// goọi hiển thị màu.

        System.out.println("Hinh tròn : "
                + "có diện tích là" + circle.getArea()

        );
        circle.displayData();


    }
}