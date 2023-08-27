package day14_String;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Split or Not Split (Yes or No)?");
        String yesOrNo = scan.next().toLowerCase();

        System.out.println("Enter the number of people:");
        int numberOfPeople = scan.nextInt();

        System.out.println("Enter the check amount:");
        double amount = scan.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair Enough/ Poor");
        String service = scan.next().toLowerCase();


        double tipRate = (service.equals ("excellent"))? 0.25 : (service.equals("Great"))?
                0.2 : (service.equals("Good"))? 0.15 : (service.equals("Fair Enough"))? 0.1
                : 0.05;

        double totalTip = amount * tipRate;

        System.out.println("Number of people entered:" + numberOfPeople);
        System.out.println("Total to pay" + amount);
        System.out.println("Total Tip"+ totalTip);

    }
}
