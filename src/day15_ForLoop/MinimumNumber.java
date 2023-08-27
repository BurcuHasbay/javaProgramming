package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {


    public static void main(String[] args) {

      /*
      Write a program that asks the user to enter a number for 5 times.
Return the minimum number
       */

        Scanner scan = new Scanner(System.in);
        int max = -2147483648; //minimum number for integer to get the maximum number

        for (int i = 0; i < 5 ; i++) {

            System.out.println("Enter a number:");
            int num =scan.nextInt();
            if (num > max){ //If the user enters a number which is greater than the current number
                max = num;
            }


        }
        System.out.println("max = " + max);





    }
}
