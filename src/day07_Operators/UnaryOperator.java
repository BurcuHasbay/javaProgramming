package day07_Operators;

public class UnaryOperator {

    public static void main(String[] args) {

        int num1 = 25;
        int num2 = -25; // this operator (-) is not optional. You have to indicate that it's negative.

        System.out.println(num1 > 0);
        System.out.println(num2 < 0);

        System.out.println("----------------------------");

        int a = 5;
        ++a; //Pre increment: increases the value by 1 right away
        --a; // Pre decrement
        System.out.println(a);

        System.out.println("--------------------------------");
        int b = 100;
        System.out.println(++b);
        System.out.println(b++);

        System.out.println("--------------------------------");

        int x = 200;
        System.out.println(--x);
        int y = 200;
        System.out.println(y--);
        System.out.println(y);







    }




}
