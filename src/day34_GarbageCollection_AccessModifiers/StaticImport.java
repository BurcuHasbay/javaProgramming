package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.*;

import static utilities.MathUtilities.*;

public class StaticImport {
    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println(name);
        System.out.println(numbers);

        System.out.println("----------------------------");

        //Find the sum of 10 and 20

        int r1 = sum(10, 20);
        int r2 = sum(100, 200);
        int r3 = subtraction(35, 5);
        int r4 = max(555, 269);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

    }
}
