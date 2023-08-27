package day10_NestedIf;

public class TernariesInfo {

    public static void main(String[] args) {


   int age = 23;

      String result = (age >= 18)? "Eligible" : "Ineligible";

        System.out.println("result = " + result);
        System.out.println("---------------------------------------------");

int number = 100;
        String result2 =(number > 0)? "Positive" : (number < 0)? "Negative" : "Zero";
        System.out.println("result2 = " + result2);


    }
}
