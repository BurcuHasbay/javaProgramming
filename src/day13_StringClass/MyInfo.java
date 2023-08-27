package day13_StringClass;

import java.util.Scanner;

public class MyInfo {


    public static void main(String[] args) {

        /*
        1. Enter your age (int>>>>< nextInt)
			2. Enter your gender (String- One word ONLY)
			3. Enter your full name (String- Multiple words)
			4. Enter your phone number (long)
			5. Enter your zip code (int)
			6. Enter your School name (String- Can be Multiple words)
			7. Enter your city name (String- Can be Multiple words)
			8. Enter your state name (String- One word ONLY)
			9. Enter your building number (int)
			10. Enter your Street name
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");

        int age = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your gender:");
        String gender = scan.nextLine();

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();

        System.out.println("Enter your phone number:");
        long phoneNumber = scan.nextLong();

        scan.nextLine();

        System.out.println("Enter your zip code:");
        long zipCode = scan.nextLong();

        scan.nextLine();

        System.out.println("Enter your School name:");
        String schoolName = scan.nextLine();

        System.out.println(" Enter your city name:");
        String cityName = scan.nextLine();

        System.out.println("Enter your state name:");
        String stateName = scan.nextLine();

        System.out.println("Enter your building number:");
        int buildingNumber = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your Street name:");
        String streetName = scan.nextLine();

        scan.close();
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("fullName = " + fullName);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("Address: \n\t" + buildingNumber + " " + stateName +
                "\n\t" + cityName + ", "+ stateName + " " + zipCode);

        System.out.println("schoolName = " + schoolName);






    }
}
