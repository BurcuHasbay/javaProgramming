package day12_Scanner;

import java.lang.invoke.SwitchPoint;

public class GradeLevel {

    public static void main(String[] args) {

        /*
        1~5: Elementary school
        6~8: Middle School
        9~12: High School
        13~16: College
        17~18: Grad School
       For any other grade: Invalid grade level given
         */

        byte number = 10;
        String result = "";

        if (number>=1 && number <=18) {

        switch (number){
 case 6: case 7: case 8: case 9:
     result = "Middle School";
     break;

     case 10: case 11: case 12:
         result= "High School";
         break;

         case 13: case 14: case 15:
             result = "College";
             break;

         case 16: case 17: case 18:
             result = "Grad School";
             break;


            default:
                result = "Elementary School";



        }




        } else {result = "Invalid Grade Level";

        }
        System.out.println(result);



    }
}
