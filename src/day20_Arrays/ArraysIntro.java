package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        //Create a variable that contains 5 names

        String[] myGroup = new String[5];
        myGroup[0] = "Burcu";
        myGroup[1] = "Osman";
        myGroup[2] = "Okan";
        myGroup[3] = "Ali";
        myGroup[4] = "Yasar";


        System.out.println(Arrays.toString(myGroup));

        System.out.println("-----------------------------------------------");

        String[]days = {"Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
        "Sunday"}; // 0, 1, 2, 3,4 ,5 ,6 ,7
        System.out.println(Arrays.toString(days));
int number = 5;
if (number<1 ||number>7){
    System.err.println("Invalid number");
    System.exit(0);
}

        System.out.println(days[number-1]);

        System.out.println("---------------------------------------------");

        String[] months = {"January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"};


        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }

        System.out.println("---------------------------------------------");

        for (int i = months.length-1; i >=0 ; i--) {
            System.out.println(months[i]);
        }







    }
}
