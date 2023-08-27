package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {


    public static void main(String[] args) {

        String sentence = "cat cat cat dog dog dog cat cat";
        int countCat = 0;
        sentence = sentence.toLowerCase();

        while ( sentence.contains("cat")){
sentence = sentence.replaceFirst("cat", "");
countCat++;

        }

        System.out.println(countCat);

        System.out.println("-----------------------------------");

        String s = "java java java python python python";

        int countJava = 0,
                countPython =0;


        while (s.contains("java") && s.contains("python")){

            s = s.replaceFirst("java", "");
           countJava++;

        }

        while (s.contains("python")){

            s= s.replaceFirst("python", "");
            countPython++;

        }
        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);











    }

}
