package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {
    public double raidus;
    public static double pi;
    public static String name;

public static ArrayList<Integer> numbers;
    public Circle(double raidus) {
        this.raidus = raidus;
       // pi = 3.14; this is not allowed because you cannot initialize static under the constructor
    }

    static {
        pi = 3.14; // pi is fixed fact, so is static. To set the variable that doesn't change, you can use this
        name= "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }

}
