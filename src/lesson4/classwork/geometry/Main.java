package lesson4.classwork.geometry;

public class Main {

    public static void main(String[] args) {

        Shape shape = new Shape();
        shape.draw();

        Circle circle = new Circle();
        shape.draw();

        Square square = new Square();
        square.draw();

        Triangle triangle = new Triangle();
        triangle.draw();

        Parallelepiped parallelepiped = new Parallelepiped();
        parallelepiped.draw();


    }

    public static void drawShape(Shape shape) {
        shape.draw();
    }

}
