package rikkei.academy.B1;

import rikkei.academy.B6.Circle;
import rikkei.academy.B6.Rectangle;
import rikkei.academy.B6.Resizable;
import rikkei.academy.B6.Square;

public class Main {
    public static void main(String[] args) {
        Resizable [] shapes = new Resizable[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4.2,3.1);
        shapes[2] = new Square(5.2);
        System.out.println();
    }

}
