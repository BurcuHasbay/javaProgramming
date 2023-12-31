package day27_WrapperClasses;

import java.rmi.ServerError;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.SortedMap;

public class Replace {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        arr = replace(arr, 2, 30);
        System.out.println(Arrays.toString(arr));

        System.out.println("------------------------------");


        String[] arr2 = {"Java", "Python", "C++", "Rubby"};
        arr2 = replace(arr2, 2, "C#");
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] replace(int[] array, int index, int newElement) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    // Replace the elements of the arrays at the given index.
    public static double[] replace(double[] array, int index, double newElement) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    public static char[] replace(char[] array, char index, char newElement) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    public static String[] replace(String[] array, int index, String newElement) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

}
