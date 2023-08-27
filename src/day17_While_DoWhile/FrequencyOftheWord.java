package day17_While_DoWhile;

public class FrequencyOftheWord {


    public static void main(String[] args) {


        String str = "JavaJava";
        int frequency = 0;
        for (int i = 0; i < str.length() - 3; i++) {

            String eachSub = str.substring(i, i + 4);
            System.out.println(eachSub);
            if (eachSub.equals("Java")) {
                frequency++;

            }

        }

        System.out.println(frequency);


    }
}
