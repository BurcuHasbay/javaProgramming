package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice2 {
    public static void main(String[] args) {


        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.addAll(Arrays.asList(44, 56, 56, 22, 9, 9, 15, 67, 38, 9, 11, 90, 11, 35, 69, 24, 9));

        ArrayList<Integer> unique = new ArrayList<>();
        for (Integer each : numberList) {
            int frequency = Collections.frequency(numberList, each);
            if (frequency == 1) {
                unique.add(each);
            }
        }

        System.out.println("unique = " + unique);
        //	1. Write a program that can return the first unique elements from an ArrayList
        //
        //			Do not use indexOf & lastIndexOf methods

    }
}
