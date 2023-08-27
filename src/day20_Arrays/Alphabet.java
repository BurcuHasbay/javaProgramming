package day20_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Alphabet {


    public static void main(String[] args) {

char[] alphabet = new char[26];

alphabet [0] = 'Z';

    /*
    System.out.println(Arrays.toString(alphabet)); //give  of the alphabets

        System.out.println("-------------------------------------------------");
        System.out.println(alphabet[0]); // only give the specific alphabet
     */

/*
char ch = 'Z';
        for (int i = 0; i < alphabet.length ; i++,ch--) {
alphabet[i]=ch;
        }
*/

        for (char i = 0, j = 'Z'; i <alphabet.length ; i++, j--) {
alphabet[i]= j;
        }

        System.out.println(Arrays.toString(alphabet));




    }
}
