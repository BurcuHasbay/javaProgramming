package day42_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyWord {
    public static void main(String[] args) {

        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

      /* if (age <0) {
           System.err.println("Invalid Age: " + age);
           System.exit(1);
           if (age > 22) {
               System.out.println("You are eligible");
           }
       }


       */


        if (age <0) {
            throw new InputMismatchException("Age cannot be negative");

        }
            if (age > 22) {
                System.out.println("You are eligible");
            }else {
                throw new RuntimeException("You must be at least 21 years old");
            }





    }

}
