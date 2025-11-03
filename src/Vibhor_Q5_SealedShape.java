sealed interface Shape permits Circle, Rectangle, Triangle {}

final class Circle implements Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }
    void area() { System.out.println("Circle Area: " + Math.PI * radius * radius); }
}

final class Rectangle implements Shape {
    double length, breadth;
    Rectangle(double length, double breadth) { this.length = length; this.breadth = breadth; }
    void area() { System.out.println("Rectangle Area: " + length * breadth); }
}

final class Triangle implements Shape {
    double base, height;
    Triangle(double base, double height) { this.base = base; this.height = height; }
    void area() { System.out.println("Triangle Area: " + 0.5 * base * height); }
}

public class Vibhor_Q5_SealedShape {
    public static void main(String[] args) {
        new Circle(5).area();
        new Rectangle(4, 6).area();
        new Triangle(3, 8).area();
    }
}
