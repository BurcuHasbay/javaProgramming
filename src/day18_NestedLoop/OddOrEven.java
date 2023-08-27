package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
     while (true) {
         System.out.println("Enter a number:");
         int num = scan.nextInt();

         if (num % 2 == 0) {
             System.out.println(num + " is an even number.");
         } else {
             System.out.println(num + " is an odd number.");
         }


         System.out.println("Would you like to enter another number?");
         String answer = scan.next().toLowerCase();

         while (!(answer.equals("yes") || answer.equals("no"))) {
             System.out.println("Invalid answer, would you like to enter another number");
             answer = scan.next().toLowerCase();
         }
        if (answer.equals("no")){
            break;
        }
     }
     scan.close();
    }
}
