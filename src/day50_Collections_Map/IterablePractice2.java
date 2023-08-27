package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice2 {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed","ahmed","aHmEd","John","Ercan","Mustafa","Ahmed","Yusufi","Christina"));

        //remove all the names "ahmed"

        Iterator<String> it = names.iterator();

        // (UP)you have to call the iterator method to make it iterable


        while (it.hasNext()){
            if (it.next().equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }

        System.out.println(names);

        System.out.println("----------------------------------");
        // OR YOU CAN USE REMOVE IF WITHOUT DEALING WITH hasNext METHOD OR ITERATOR


        List<String>names3 = new ArrayList<>();
        names3.addAll(Arrays.asList("Ahmed","ahmed","aHmEd","John","Ercan","Mustafa","Ahmed","Yusufi","Christina"));

        names3.removeIf(each-> each.equalsIgnoreCase("ahmed"));


        System.out.println(names3);




    }
}
