package day42_Exception;

import java.nio.channels.FileLockInterruptionException;
import java.util.SortedMap;

public class ThrowsKeyWord {
    public static void main(String[] args) throws InterruptedException, FileLockInterruptionException  {


        System.out.println("--------------------Test1------------ ");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Cydeo");

        System.out.println("----------Tesr1 Completed------------");

        System.out.println("-----------------Test2------------------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Batch 25");

        System.out.println("---------Test2 Completed-------------");







    }
}
