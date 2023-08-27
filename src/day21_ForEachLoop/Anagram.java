package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "acdb";
        String str2 = "dbca";
// Write a program that can check if str1 and str2 are built out of
// same characters.

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println();
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean anagram = Arrays.equals(ch1, ch2);

        System.out.println("Anagram: " + anagram);

        System.out.println("------------------------------------");

        String sentence = "Wooden Spoon";
        String[] word = sentence.split(" ");
        System.out.println(Arrays.toString(word));

        System.out.println("------------------------------------");

        String email = "burcu.hasbay@gmail.com";

        String[] arr = email.split("@");
        System.out.println(Arrays.toString(arr));

    }
}
