package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username:");
        String uN = scan.nextLine();

        System.out.println("Enter your password:");
        String pW = scan.nextLine();

        if (uN.equals("Cydeo") && pW.equals("WoodenSpoon")) {
            System.out.println("Logged In.");
        } else {

            for (int i = 0; i < 3; i++) {
                System.out.println("Incorrect username or password");
                System.out.println("Enter your username again");
                uN = scan.next();
                System.out.println("Enter your password again");
                pW = scan.next();

                if (uN.equals("Cydeo") && pW.equals("WoodenSpoon")) {
                    System.out.println("Logged In.");
                    break;
                }


            }

            if (!(uN.equals("Cydeo") && pW.equals("WoodenSpoon"))){
                System.err.println("Your account has been locked. Please contact your support person to unlock it.");
            }

        }


    }
}
/*
 You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon

                Ask the user to enter their credentials.
  If credentials are matched, your program should print "Logged in."
  If the credentials are not matched, the program should allow the user to
   have three attempts to enter the correct credentials and if all three attempts
   are failed, then print "Your account is locked."
 */