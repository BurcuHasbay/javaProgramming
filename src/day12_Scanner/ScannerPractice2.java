package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {
        System.out.println("Enter your full name");

        Scanner input = new Scanner(System.in);
      String name = input.nextLine();
        System.out.println("name = " + name);

input.close();

        // System.out.println("Enter true or false:");
        //boolean result = input.nextBoolean();




    }
}
