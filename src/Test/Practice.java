package Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

//2. Write a program that can find the maximum, minimum and average number from an ArrayList of integers

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(35));
        list.addAll(Arrays.asList(36));
        list.addAll(Arrays.asList(37));
        list.addAll(Arrays.asList(38));
        list.addAll(Arrays.asList(39));
        list.addAll(Arrays.asList(40));
        list.addAll(Arrays.asList(41));
        list.addAll(Arrays.asList(42));
        list.addAll(Arrays.asList(43));
        list.addAll(Arrays.asList(44));
        list.addAll(Arrays.asList(45));
        list.addAll(Arrays.asList(46));

        System.out.println("list = " + list);

        int max = list.get(0);
        int min = list.get(0);
        int sum = 0;


        for (Integer each : list) {
            if (each>max){
                max=each;
            }

        }

        for (Integer each : list) {
            if (each<min){
                min=each;
            }
            sum += each;
        }

        double average = (double) sum/list.size();
        System.out.println("average = " + average);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
