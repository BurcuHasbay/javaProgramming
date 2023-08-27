package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        arr = addInteger(arr, 5); //assign it back to make sure that its like this
        // {1,2,3,4,5}

        /*
        DONT FORGET  You cannot add a new element to an array. You can just create
        a new one. Because Array's size is fixed.
         */

        System.out.println(Arrays.toString(arr));

        System.out.println("-------------------------------");
        double[] arr2 = {1.5, 2.5, 2.5, 4.5};
        arr2 = addDoubleArray(arr2, 5.5);
        System.out.println(Arrays.toString(arr2));


        System.out.println("-----------------------------");

        String[] names = {"Osman", "Burcu", "Aysegul", "Muge", "Mansur" };
        names = addString(names, "Rihanna");
        names = addString(names, "Mustafa Keser");
        System.out.println(Arrays.toString(names));

        System.out.println("------------------------------");

        char[] chars = {'A', 'B', 'C', 'D'};
        chars = addChar(chars, 'E');
        System.out.println(Arrays.toString(chars));

    }


    public static char[] addChar(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;

        }
        result[i] = element;
        return result;
    }


    public static int[] addInteger(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;

        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }


    public static double[] addDoubleArray(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;


        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;

    }


    public static String[] addString(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;

        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }
}





