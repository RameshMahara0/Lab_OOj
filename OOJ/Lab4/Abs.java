abstract class Shape {
    int a, b;

    abstract void printArea();
}


class Rectangle extends Shape {

    Rectangle(int l, int w) {
        a = l;
        b = w;
    }

    void printArea() {
        System.out.println("Area of Rectangle = " + (a * b));
    }
}


class Triangle extends Shape {

    Triangle(int base, int height) {
        a = base;
        b = height;
    }

    void printArea() {
        System.out.println("Area of Triangle = " + (0.5 * a * b));
    }
}


class Circle extends Shape {

    Circle(int r) {
        a = r;
    }

    void printArea() {
        System.out.println("Area of Circle = " + (3.14 * a * a));
    }
}


public class Abs {
    public static void main(String[] args) {

        Shape r = new Rectangle(5, 4);
        Shape t = new Triangle(6, 3);
        Shape c = new Circle(7);

        r.printArea();
        t.printArea();
        c.printArea();
    }
}
