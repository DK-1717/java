class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void printArea() {
        System.out.println("Area: " + length * breadth);
    }

    void printPerimeter() {
        System.out.println("Perimeter: " + 2 * (length + breadth));
    }
}

class Square extends Rectangle {
    Square(int side) {
        super(side, side);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle:");
        rectangle.printArea();
        rectangle.printPerimeter();

        Square square = new Square(7);
        System.out.println("Square:");
        square.printArea();
        square.printPerimeter();

        // Using array of objects
        Rectangle[] shapes = new Rectangle[2];
        shapes[0] = rectangle;
        shapes[1] = square;

        for (Rectangle shape : shapes) {
            if (shape instanceof Rectangle) {
                System.out.println("Rectangle:");
            } else if (shape instanceof Square) {
                System.out.println("Square:");
            }
            shape.printArea();
            shape.printPerimeter();
        }
    }
}