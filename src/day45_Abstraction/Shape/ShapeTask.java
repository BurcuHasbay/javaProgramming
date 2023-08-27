package day45_Abstraction.Shape;

public abstract class ShapeTask {


 private final String name;

    public String toString() {
        return getClass().getSimpleName() +"{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }

    public ShapeTask(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public abstract double area();

    public abstract double perimeter();



}
