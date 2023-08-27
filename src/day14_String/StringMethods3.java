package day14_String;

public class StringMethods3 {

    public static void main(String[] args) {

String str = "Java is fun, I love learning Java";
 String str2 = str.replace("Java" , "Python");
        System.out.println("str2 = " + str2);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python";
        String sentence2 = sentence.replace("Python", "");
        sentence2.replace("              ", " ");

        sentence2 = sentence2.replace("   ", " ");
        System.out.println("sentence2 = " + sentence2);

        System.out.println("--------------------------------------------");
        String s = "Dog Dog Dog Dog Dog Dog Dog ";
        s = s.replace("Dog", "Cat");
        System.out.println("s = " + s);

        System.out.println("-----------------------------------------");
        String s3 = "C# is fun, C# is cool";
        s3 = s3.replace(" C#", "Java");
        System.out.println("s3 = " + s3);


        System.out.println("-------------------------------");

        String result = "Java Java Java";
        result = result.replaceFirst("Java", "Python");
        System.out.println("result = " + result);




    }
}
