package day10_NestedIf;

public class NesteIfIntro {

    public static void main(String[] args) {

        int score = 400;

        if (score >= 0 && score <=100) {

            if (score >=60) {
                System.out.println("Passed !");} else {
                System.out.println("Failed!");}



        } else { //if the score is not valid
            System.out.println("Invalid score");}


        System.out.println("------------------------------------------------------");

        int age = 25;
        boolean hasID = true;

        if (hasID){

            if (age >= 21) {
                System.out.println(" is eligible to buy alcohol.");
            } else {
                System.out.println(" is ineligible to buy alcohol.");
            }


        } else {
            System.out.println("You must have an ID to buy alcohol");}
        System.out.println("----------------------------------------------------------");
         int number = 5;

        if (number >= 1 && number <= 7) { //if the num

         if (number == 1) {
             System.out.println("Monday");}
         else if (number == 2) {
             System.out.println("Tuesday"); }
         else if (number == 3) {
             System.out.println("Wednesday"); }
         else if (number == 4) {
             System.out.println("Thursday"); }
         else if (number == 5) {
             System.out.println("Friday"); }
         else if (number ==6) {
             System.out.println("Saturday");}
         else {
             System.out.println("Sunday");}



         } else {
            System.out.println(" Invalid Number"); }

        }

        }








