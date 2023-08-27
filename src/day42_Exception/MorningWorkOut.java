package day42_Exception;

import day11_Switch_Scanner.ScannerInfo;

import java.util.Scanner;

public class MorningWorkOut {
    public static void main(String[] args) throws InterruptedException{


        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter the number of minutes");
        int minutes=scan.nextInt();

        scan.close();

        for (int i = minutes; i >0 ; i--) {
            for (int z=59; z>= 0; z--){
                System.out.print("\r" + (i-1)+ " minutes and" + z+ " seconds left");
            Thread.sleep(1000);
            }
        }


        System.out.println("-------Push-ups completed----------");






          }




    }

