package day30_CustomClass;

import day28_ArrayList.ArraysList_Method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Collections.swap(numbers, 0, numbers.size() - 1);
        System.out.println("numbers = " + numbers);

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6));

        System.out.println(list);

        int size = list.size();
        list.removeAll(Arrays.asList(0));
        System.out.println(list);
        int newSize = list.size();

        int totalNumberOfZero = size - newSize;
        for (int i = 0; i < totalNumberOfZero; i++) {
            list.add(0);
        }
        System.out.println(list);
        System.out.println("--------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6));
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
            if (each != 0) {
                result.add(each);
            }
        }

        for (Integer each : list2) {
            if (each == 0) {
                result.add(each);
            }
        }


        System.out.println(result);

        //Write a program that can move all the zeros to the last indexes of ArrayList

        // {1,0,2,0,3,0,4,0,5,0,6}
        // {1,2,3,4,5,6,0,0,0,0,0}
        System.out.println("----------------------------------------");

        String str = "ABCD123&£$!456EFG!";

        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }
        System.out.println("chars = " + chars);
        ArrayList<Character> letters = new ArrayList<>(chars);

        letters.removeIf(p -> !Character.isLetter(p)); //Remove if the character is NOT '!' digit.

        System.out.println("letters = " + letters);

        ArrayList<Character> digits = new ArrayList<>(chars);
       digits.removeIf(p-> !Character.isDigit(p));

        System.out.println("digits = " + digits);

        ArrayList<Character> specialCharacters = new ArrayList<>(chars);
        specialCharacters.removeAll(digits);
        specialCharacters.removeAll(letters);

      // you can use this too.  specialCharacters.removeIf(p-> Character.isLetterOrDigit(p));
        System.out.println("specialCharacters = " + specialCharacters);
    }
}
