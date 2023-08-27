package day21_ForEachLoop;

import java.util.Arrays;

public class ArrayUtility {


    public static void main(String[] args) {


        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(nums);

        String tr = "Java";

        System.out.println("-------------------------------");

        int[] scores = {95, 100, 55, 65, 85, 79};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        System.out.println("Min Score: " + scores[0]);
        System.out.println("Max Score: " + scores[scores.length - 1]);

        System.out.println("----------------------------------");

        String[] names = {"Osman", "Burcu", "Okan", "Ali", "Yunus", "Mehtap"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        System.out.println("----------------------------------------");

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 1, 2};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r1 = Arrays.equals(arr1, arr2);

        System.out.println(r1);
        System.out.println("---------------------------");


        char[] ch1 = {'a', 'b', 'c'};
        char[] ch2 = {'b', 'a', 'c'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println(anagram);

    }
}
