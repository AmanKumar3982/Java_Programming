class Shape {
    public double findArea() {
        return 0; // Default implementation, overridden by subclasses
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double findArea() {
        return side * side;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double findArea() {
        return length * width;
    }
}

public class E5Q6 {
    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println("Area of square: " + square.findArea());
        System.out.println("Area of rectangle: " + rectangle.findArea());
    }
}
