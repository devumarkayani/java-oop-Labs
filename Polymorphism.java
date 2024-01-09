// Base class
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

// Derived class 1
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Derived class 2
class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

// Another class using polymorphism
class Drawing {
    public void drawShape(Shape shape) {
        shape.draw(); // This will call the appropriate draw method based on the actual object type
    }
}

public class Polymorphism{
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();

        Drawing drawing = new Drawing();

        // Using polymorphism with method overloading
        drawing.drawShape(circle); // Output: Drawing a circle
        drawing.drawShape(square); // Output: Drawing a square

        // Using polymorphism with method overriding
        Shape shape1 = new Circle();
        Shape shape2 = new Square();

        shape1.draw(); // Output: Drawing a circle
        shape2.draw(); // Output: Drawing a square
    }
}
