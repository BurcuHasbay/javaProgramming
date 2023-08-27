package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {
    public static void main(String[] args) {

        int[] number = {1, 2, 3, 4, 5, 6};
        number = addElement(number, 7);

        char[] chars = {'A', 'B', 'C', 'D'};
        chars = addElement(chars, 'E');

        String[] names = {"Osman", "Burcu", "Ali", "Okan", "Mansur Yavas"};
        names = addElement(names, "Yasar Hasbay");


        System.out.println("Numbers: " + Arrays.toString(number));
        System.out.println("Names: " + Arrays.toString(names));
        System.out.println("Chars: " + Arrays.toString(chars));


    }


    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;

        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;

    }

    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;

    }

    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        return result;
    }


}