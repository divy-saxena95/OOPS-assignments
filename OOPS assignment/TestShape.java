 abstract class Shape {

    public abstract double getArea();
    public abstract double getPerimeter();
}
 class Square extends Shape {
    private final double width, length; //sides

    public Square() {
        this(1,1);
    }
    public Square(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea(){ 
        
        return width * length;
    }

    @Override
    public double getPerimeter() {
        
        return 2 * (width + length);
    }

}
 class Circle extends Shape {
    private final double radius;
    final double pi = Math.PI;

    public Circle() {
        this(1);
    }   
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
       
        return pi * Math.pow(radius, 2);
    }

    public double getPerimeter() {
       
        return 2 * pi * radius;
    }
}
public class TestShape {
    public static void main(String[] args) {

        // Square test
        double width = 5, length = 5;
        Shape square = new Square(width, length);
        System.out.println("Square width: " + width + " and length: " + length
                + "\nResulting area: " + square.getArea()
                + "\nResulting perimeter: " + square.getPerimeter() + "\n");

        // Circle test
        double radius = 5;
        Shape circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
            + "\nResulting Area: " + circle.getArea()
            + "\nResulting Perimeter: " + circle.getPerimeter() + "\n");

       
    }
}

