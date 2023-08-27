package day07_Operators;

public class ArithmeticOperators {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 3;

        int division = num1/num2; //division variable contains the result of num1 divided by num2
        int remainder = num1%num2;// Remainder variable contains the remainder of num1 divided by number2
        System.out.println(num1 + " divided by " + num2 + " is equal to "+ division +
                " with the remainder of "+ remainder);

         //What's the remainder of 25 divided by 4?

        int num3 = 25;
        int num4 = 4;

        int remainder1 = num3/num4;
        int division1 = num3%num4;

        System.out.println(num3 + " divided by "+ num4 + " is equal to " + division1 + " with the remainder of " + remainder1);


    }

}
