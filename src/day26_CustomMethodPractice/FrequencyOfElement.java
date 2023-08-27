package day26_CustomMethodPractice;

public class FrequencyOfElement {

    public static void main (String []args){
        int[] arr = {1, 1, 11, 1, 1, 2, 2, 3, 3, 4, 4, 1, 1, 1};
       int n= frequencyOfElement(arr, 1);
        System.out.println(n);
    }


    public static int frequencyOfElement(int[] array, int element){
        int count = 0;
        for (int each:array) {
            if (each == element){
                count++;
            }

        }
        return count;
    }







}
