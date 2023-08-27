package day27_WrapperClasses;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5,};
        arr = removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] removeDuplicates(int[] array) {
        int[] result = {};

        for (int i = 0; i < array.length; i++) {

            String arr = array.toString();
            if (result.toString().contains(arr)) {

               continue;
            }

        }
        return result;

    }
}
