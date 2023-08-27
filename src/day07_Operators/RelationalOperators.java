package day07_Operators;

import java.security.KeyStore;

public class RelationalOperators {

    public static void main(String[] args) {

        boolean result1 = 200>40; //True
        System.out.println("result1 = " + result1);

        boolean result2 = 300>=150;

        System.out.println("result2 = " + result2);

        boolean result3 = 100 >= 100;
        System.out.println("result3 = " + result3);

        boolean result4 = 300>=500;
        System.out.println("result4 = " + result4);

        //credit score is 720
        int creditScore = 745;
        boolean isEligibleForLoan = creditScore >= 720; // if the credit Score is greater or equal, then it's eligible for loan

       int Studentgrade = 58;
       boolean hasfailed = Studentgrade <= 59;
        System.out.println("hasfailed = " + hasfailed);

        System.out.println("-----------------------------------------");

        int x1 = 100;
        int y1 = 200;

        boolean equal = x1 == y1;
        System.out.println("equal = " + equal);

        System.out.println("---------------------------------------------");
        boolean result6 = 100 != 300;
        System.out.println("result6 = " + result6);












    }







}
