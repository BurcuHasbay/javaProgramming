package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {

        Scanner  input = new Scanner((System.in));
        System.out.println("Enter your age:");
        int age = input.nextInt();

        input.nextLine();


        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your spouse's name");
        String spouseName = input.nextLine();



        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("spouseName = " + spouseName);


        /*
        1. Ask users to enter age
        2. Ask user to enter full name
         */

        input.close();

    }
}
