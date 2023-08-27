package day21_ForEachLoop;

import java.util.Arrays;

public class ArrayUtility2 {


    public static void main(String[] args) {

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'D', 'F', 'G', 'H', 'I'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2, 6 + 1);
        System.out.println(ch2);


        System.out.println("-------------------------------------");
        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        //Index Number:  0, 1,   2, 3 , 4,5, 6, 7, 8, 9
        int[] result = Arrays.copyOfRange(scores, 3, 8);

        System.out.println(Arrays.toString(result));


    }
}
