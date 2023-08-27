package utilities;

import java.util.Arrays;

public class ArrayUtilities {

    public static double[] addDouble(double[] array, double element) {
        double[] result = new double[array.length + 1];
        int i = 0;

        for (double each : array) {
            result[i++] = each;
        }
        result[(int) i] = element;
        return result;
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

    public static String[] addString(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;

        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }


    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }
        for (int each : arr2) {
            result[i++] = each;
        }
        return result;

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
    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;

        for (String each : array) {
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




    public static int[] addInteger(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;

        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }



    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }

        }
        return count;
    }

    public static int minimumNumber(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    public static String removeDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains("" + each)) { //contain method wants you to use String that's why you need to add ""
                result += each;
            }


        }
        return result;
    }


    public static boolean anagram(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        return Arrays.equals(ch1, ch2);
    }

    public static String reverse(String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }


    public static void printEachChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }


    public static double[] replaceAll(double[] array, double oldValue, double newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }


    public static String[] replaceAll(String[] array, String  oldValue, String  newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)) {
                array[i] = newValue;
            }
        }
        return array;
    }


    public static int[] replaceAll(int[] array, int oldValue, int newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }


    public static char[] replaceAll(char[] array, char oldValue, char newValue) {
        for (char i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }


    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        int J = 0;

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;

    }















}
