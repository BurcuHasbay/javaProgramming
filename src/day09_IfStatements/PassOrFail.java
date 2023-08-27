package day09_IfStatements;

public class PassOrFail {

    public static void main(String[] args) {

        int score = 75;

        if (score >= 60){
            System.out.println("Congrats you passed!");} else {
            System.out.println("Sorry failed");}

        System.out.println("---------------------------------------------");

        int age = 17;

        if (age < 18){
            System.out.println(age + " is NOT eligible to buy alcoholic beverages"); } else {
            System.out.println(age + " is eligible to buy alcoholic beverages");}


        System.out.println("--------------------------------------------");

        int num1 = 45,
                num2 = 38;

        if (num1 > num2){
            System.out.println(num1 + " is the maximum number.");} else {
            System.out.println(num2 + " is the maximum number.");}








    }


}
