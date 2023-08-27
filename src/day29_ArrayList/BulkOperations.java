package day29_ArrayList;

import utilities.ArrayUtilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 3, 3, 3, 4, 5, 5, 6, 6, 7, 8, 8));

        System.out.println(list);

        list.removeAll(Arrays.asList(3, 5, 8));
        System.out.println(list);

        System.out.println("-------------------------------------");

        String[] names = {"Osman", "Burcu", "Ayececul", "Okan", "KK", "5liMasa"};


        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
        System.out.println(nameList);


        System.out.println("------------------------------------");

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2));
        System.out.println("list3: " + list3);

        System.out.println("---------------------------------");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list4.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list4.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        System.out.print(list4);
        System.out.println("-------------------------------------------");
        list4.removeIf(p -> p < 5);
        System.out.println(list4);

        System.out.println("-----------------------------------");
        ArrayList<String> list5 = new ArrayList<>();

        list5.addAll(Arrays.asList("Java", "JavaScript", "Python", "C#", "C++"));

        System.out.println(list5);
        list5.removeIf(p -> p.startsWith("J"));
        System.out.println(list5);

        System.out.println("-------------------------------------");

        ArrayList<String> name = new ArrayList<>();
        name.addAll(Arrays.asList("Eye","Racecar","Java","Cydeo","Ece","Level"));





















    }
    //Now the method of ArrayList. you can add Integer array to the ArrayList with this method

    public static ArrayList<Integer> convertArrayToArrayList(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }
        return list;
    }


}
