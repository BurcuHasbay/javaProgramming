package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlock {

    public static   void main(String[] args) {


        System.out.println("Test2 Started");

        int[] numbers= {1,2,3,4,5};

        try {
            System.out.println(numbers[200]);
            System.out.println("Try Block");
        }catch (RuntimeException a){
            a.printStackTrace();
        }

        System.out.println("Test1 Completed");


        System.out.println("----------------------");
        System.out.println("Hello");

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Cydeo");


        System.out.println("------------------");

        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }









}
