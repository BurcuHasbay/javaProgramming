package day16_ForLoopStringPractice;

public class Reverse {


    public static void main(String[] args) {


/*
1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */

String str = "Wooden Spoon";
//Index =     01234567891011....

String result = ""; //Contains the reversed version of str

for (int i = str.length(); i >= 0; i--){

        result += str.charAt(i); //adding each character to the result.
}

        /*
           result += str.charAt(str.length()-1); //n
        result += str.charAt(10); //o
        result += str.charAt(9); //o
        result += str.charAt(8); //p
        result += str.charAt(7);
        result += str.charAt(6);
        result += str.charAt(5);
        result += str.charAt(4);
        result += str.charAt(3);
        result += str.charAt(2);
        result += str.charAt(1);
        result += str.charAt(0);

         */



        System.out.println(result);















    }
}
