class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }

    void draw(String color) {
        System.out.println("Drawing a shape with color: " + color);
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    void draw(double radius) {
        System.out.println("Drawing a circle with radius: " + radius);
    }
}


public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();

        shape.draw(); // Calls draw() method in Shape class
        shape.draw("blue"); // Calls draw(String color) method in Shape class

        circle.draw(); // Calls overridden draw() method in Circle class
        circle.draw(5.0); // Calls draw(double radius) method in Circle class
    }
}

