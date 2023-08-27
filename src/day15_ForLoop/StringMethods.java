package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {

 String str = "      ";
 boolean r = str.isBlank();

 String str2 = "";
 boolean r2 = str2.isEmpty();

        System.out.println(r);
        System.out.println(r2);

        System.out.println("-------------------------------");


String s1 = "CYDEO";
String s2 = "cydeo";

        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equalsIgnoreCase(s2)); //true

        System.out.println("---------------------------");

        String sentence = "My favorite programming language is Java";
       boolean hasCSharp = sentence.contains("C#");

        System.out.println("----------------------------");
boolean hasJava = sentence.contains("Java");
boolean hasJava2 = sentence.contains("java");
boolean hasJava3 = sentence.toLowerCase().contains("java");
        System.out.println(hasJava);
        System.out.println(hasCSharp);
        System.out.println(hasJava2);

        System.out.println("-------------------------");
        System.out.println(hasJava3);
        boolean r3 = sentence.toLowerCase().contains("jAvA"); // SOMETHING IS WRONG HERE MUHTAR !

        System.out.println(r3);

        System.out.println("---------------------------------");

        String a = "Wooden Spoon";

        boolean x = a.startsWith("oo"); // False because startsWith method always starts  with 0
        boolean x1 = a.startsWith("Woo"); // True
        System.out.println(x);
        System.out.println(x1);
        boolean y = a.endsWith("Spoon");
        System.out.println(y); //true


    }
}
