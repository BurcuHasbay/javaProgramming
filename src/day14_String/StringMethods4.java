package day14_String;

public class StringMethods4 {


    public static void main(String[] args) {

        String word = "Cydeo School";
        String brand = word.substring(0, 4 + 1);

        System.out.println(brand);

        String word2 = "Java Programming Language";

        String s = word2.substring(0, word2.indexOf(" ") );
        String s1 = word2.substring(word2.indexOf(" ") + 1, word2.lastIndexOf(" "));
        String s2 = word2.substring(word2.lastIndexOf(" ") + 1);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);


    }
}
