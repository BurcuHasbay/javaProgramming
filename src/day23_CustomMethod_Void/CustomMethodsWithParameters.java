package day23_CustomMethod_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

        //  oddOrEven(); //the method demands an additional information
        oddOrEven(10);


        ageOfPerson(1994);

        System.out.println("---------------------");
        printNumbers(1000, 2000);



    }

//create a function that can check if a number is odd number or
// even number

    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }


    //create a function that can display age of a person

    public static void ageOfPerson(int birthday) {
        int age = 2023 - birthday;
        System.out.println("Your age is: " + age);
    }


    //create a number that can print numbers between X and Y.

    public static void printNumbers(int x, int y) {
        while (x < y -1) {
            System.out.println(x++ + 1);
        }

    }






}