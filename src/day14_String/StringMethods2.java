package day14_String;

public class StringMethods2 {

    public static void main(String[] args) {

String str = "     batch   25       ";

str = str.trim();

        System.out.println(str);

 String str1 = "Cydeo School";
 int n1 = str1. indexOf("ool");

        System.out.println("n1 = " + n1);

 String str2 = "Java Programming Language";
 int n2 = str2.indexOf("mmi");
        System.out.println("n2 = " + n2);
int n3 = str2.indexOf("g ");
        System.out.println("n3 = " + n3);
int n4 = str2.indexOf("ua");
        System.out.println("n4 = " + n4);
int n5 = str2.lastIndexOf("g");
        System.out.println("n5 = " + n5);

        System.out.println("---------------------------------------");

        String s = " Java Nova Cava Wawa orange";

      int firstA = s.indexOf("a");
      int lastA = s.lastIndexOf("a");
      int secondA = s.indexOf("a ");
      int thirdA = s.indexOf("a C");
      int fourthA = s.indexOf("Ca") +1;
      int fifthA = s.indexOf("Va")+1;


        System.out.println("firstA = " + firstA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("lastA = " + lastA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("fourthA = " + fourthA);




    }
}
