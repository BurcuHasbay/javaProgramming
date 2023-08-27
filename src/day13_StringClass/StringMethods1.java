package day13_StringClass;

public class StringMethods1 {

    public static void main(String[] args) {

String word = "Cydeo";
// index =     01234
char thirdChar = word.charAt(3);

        System.out.println("thirdChar = " + thirdChar);

        System.out.println("------------------------");

        String s1 = "Batch 25 is the best batch";
        int totalChar = s1.length();

        System.out.println("totalChar = " + totalChar);

        char lastChar = s1.charAt(s1.length()-1);
        System.out.println("lastChar = " + lastChar);




    }
}
