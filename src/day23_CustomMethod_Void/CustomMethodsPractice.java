package day23_CustomMethod_Void;

public class CustomMethodsPractice {
    public static void main(String[] args) {

        HelloWorld5times();
        System.out.println("----------------------");
        HelloCydeo5times();

        System.out.println("------------------------------" );

        evenNumbers();


    }

    //create a function that can print Hello World five times- HelloWorld5times
    // Create a function that can print Hello Cydeo 5 times- HelloCydeo5times

    public static void HelloWorld5times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

    }

    public static void HelloCydeo5times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }


    }

    // create a function that can print all the even numbers from 1-10-evenNumbers

    public static void evenNumbers() {
        for (int i = 2; i < 11; i += 2) {
            System.out.print(i + " ");
        }

    }




}
