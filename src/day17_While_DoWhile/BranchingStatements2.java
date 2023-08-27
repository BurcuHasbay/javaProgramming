package day17_While_DoWhile;

public class BranchingStatements2 {


    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {

            if (i == 'C') {
                break; // continue; (then it will only skip 'C' and continue with 'D'

            }
            System.out.println(i);
        }


        System.out.println("----------------------------------------------");
        for (char i = 'A'; i <= 'E'; i++) {

            if (i == 'C') {
                continue;

            }
            System.out.println(i);
        }

        System.out.println("------------------------------------------------------");

/*
Print all the even numbers between 1-10
 */
        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) { // to skip odd numbers
                continue;
            }
            System.out.println(i);
        }

        System.out.println("---------------------------------------");

        for (int i = 0; i <= 10; i++) {

            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }


    }
}
