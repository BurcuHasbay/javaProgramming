package day17_While_DoWhile;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scan.nextInt(); //valid age is 1-120

        while ( !(age >= 1 && age <= 120)){

            System.out.println("Invalid entry, please re-enter:");
            age = scan.nextInt();
        }

        System.out.println("Are you an US citizen?");
        String answer = scan.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no")    )  ){
            System.err.println("Invalid answer, please re-write");
            System.err.println("Are you a citizen? yes/no");
            answer = scan.next().toLowerCase();

        }



    }
}
