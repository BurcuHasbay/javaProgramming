package day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProposal {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me?");
        String answer = scan.nextLine();

        while (! (answer.equals("yes") || answer.equals("no"))){
            System.out.println("Invalid answer, please think again");
            answer = scan.nextLine().toLowerCase();

        }

        if (answer.equals("yes")){
            System.out.println("Congrats! Right choice");

        }
        if (answer.equals("no")){
            System.out.println("you made a huge mistake");
        }





    }
}
