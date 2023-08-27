package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));
        Collections.sort(list);
        System.out.println(list);
        System.out.println("---------------------------------------");
        ArrayList<Character> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        System.out.println(list1);
        Collections.reverse(list1);
        System.out.println(list1);
        System.out.println("----------------------------------------");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
        System.out.println(list3);

        Collections.swap(list3, 1, 4);
        System.out.println(list3);

        int max = Collections.max(list3);
        int min = Collections.min(list3);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("-------------------------------------");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10, 10, 30, 40, 50, 10, 10, 10));
        System.out.println(list4);
        Collections.replaceAll(list4, 10, 1000);
        System.out.println(list4);
        System.out.println("-------------------------------------");
        int frequency=Collections.frequency(list4, 1000);
        System.out.println("frequency = " + frequency);
    }


}
