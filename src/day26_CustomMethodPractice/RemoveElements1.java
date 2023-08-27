package day26_CustomMethodPractice;

import java.util.Arrays;

public class RemoveElements1 {
    public static void main(String[] args) {
        int [] numbers = {100,200,300,400,500,600};
       numbers= removeElement(numbers,1); // it only creates a new array.

        System.out.println(Arrays.toString(numbers));
    }

    public static int[] removeElement(int[] array, int index) {
        int[] result = new int[array.length - 1];
        int j = 0;
        for (int each : array) {
            if (each == array[index]) {
                continue;
            }

            result[j++] = each;

        }
        return result;


    }
}

/*

	2. Create a class named RemoveElements:
			2.1 Create a method that passes two parametetrs: an integer array and an integer index. the method removes the element at the given index of the array and returns the new array
					Ex:
						int[] arr = {10,20,30,40}
						removeElement(arr, 2) ==> {10, 20, 40}

 */