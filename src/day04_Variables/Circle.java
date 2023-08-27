package day04_Variables;

public class Circle {

    public static void main(String[] args) {

        double PI = 3.14;
        double radius = 5.5;
        double area = radius * radius * PI;
        double perimeter = radius * 2 * PI;
        double diameter = radius * 2;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

    }
}
