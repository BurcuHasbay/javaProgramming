package day45_Abstraction.Shape;

public class Cube extends ShapeTask implements Volume{
    public Cube(String name) {
        super("Cube");
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }


    @Override
    public double volume() {
        return 0;
    }
}
