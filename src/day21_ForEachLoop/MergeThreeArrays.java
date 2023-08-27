package day21_ForEachLoop;

public class MergeThreeArrays {
    public static void main(String[] args) {

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H', 'I'};

        char[] chars = new char[ch1.length + ch2.length];

        int i = 0;

        for (char each: ch1) {
            chars[i]=each;
            i++;
        }
        for (char each: ch2) {
            chars[i]=each;
            i++;
        }
        System.out.println(chars);



    }
}
