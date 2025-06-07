class Shape {

    public void calculateArea() {
        System.out.println("Area calculation is not defined for a generic shape.");
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
    public void calculateArea() {
        double area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }


    public void calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}


class Circle extends Shape {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }


    public void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("The circumference of the circle is: " + circumference);
    }
}


public class ShapeDemo {
    public static void main(String[] args) {
        System.out.println("--- Demonstrating Rectangle Object ---");

        Rectangle myRectangle = new Rectangle(10.0, 5.0);
        myRectangle.calculateArea();
        myRectangle.calculatePerimeter();

        System.out.println("\n--- Demonstrating Circle Object ---");

        Circle myCircle = new Circle(7.0);
        myCircle.calculateArea();
        myCircle.calculateCircumference();
    }
}
