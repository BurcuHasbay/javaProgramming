package day50_Collections_Map;

import java.util.*;

public class ListSetPractice {
    public static void main(String[] args) {


        Set<Integer>set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println(set);

       List<Integer> list =new ArrayList<>(set); //CONSTRUCTOR OF ARRAYLIST TO CREATE OBJECT
        System.out.println(list);


        List<String> names = null;
       //   System.out.println(names.size());


        System.out.println("----------------");

        List<Character> characters = new Stack<>();
        characters.addAll(Arrays.asList('A','B','C','D','E'));
        System.out.println("Characters "+characters);
        ( (Stack)characters ).pop();

        System.out.println( "Characters "+characters );

        System.out.println("-----------------------");

        List<String> names2 = new LinkedList<>();
        names2.addAll(Arrays.asList("Burcu","Osman","Okan","Aycecül","Jiye","Mansur"));

        System.out.println(names2);

        ((LinkedList<String>) names2).poll();





    }
}
