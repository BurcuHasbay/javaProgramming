package day27_WrapperClasses;

import java.io.FilterOutputStream;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "1234";
        int num = Integer.parseInt(str);
        System.out.println(num + 1); //1235
        System.out.println(str + 1); //12341
        System.out.println("-------------------------");
        String str2 = "10.5";
        double num2=Double.parseDouble(str2);
        System.out.println(num2 + 1);


        System.out.println("-----------------------");

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("Max: " +max);
        System.out.println("Min: " + min);

        System.out.println("-----------------------------");

        String st = "ab1cde2efg3hi4"; // total number should be 10
        int sum = 0;

        for (char each:st.toCharArray()) {
            if (Character.isDigit(each)){
                sum+= Integer.parseInt(""+ each);
            }

        }
        System.out.println("Sum: "+ sum);

    }


}
