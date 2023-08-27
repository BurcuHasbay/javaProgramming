package day26_CustomMethodPractice;

import utilities.ArrayUtilities;

import java.util.Arrays;

public class MergeTwoArrays2 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9,};

        int []arr3 = merge(arr1,arr2);

        System.out.println(Arrays.toString(arr3));


    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = {};
        for (int each : arr1) {
            result = ArrayUtilities.addInteger(result, each);
        }

        for (int each : arr2) {
            result = ArrayUtilities.addInteger(result, each);
        }
        return result;
    }


    public static double[] merge(double[] arr1, double[] arr2) {
        double[] result = {};
        for (double each : arr1) {
            result = ArrayUtilities.addDouble(result, each);
        }

        for (double each : arr2) {
            result = ArrayUtilities.addDouble(result, each);
        }
        return result;
    }




}
