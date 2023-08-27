package day50_Collections_Map;

import day16_ForLoopStringPractice.Palindrome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class IterablePractice {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,3,4,5));

// remove all the elements that are less than 4.

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <4){
                list.remove(i);

            }
        }

        System.out.println(list);


        System.out.println("---------------------------");


        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,3,4,5));

        Iterator<Integer> it =list2.iterator();

    // it returns you boolean hasNext method
/*
        boolean r1 = it.hasNext();
        System.out.println(r1);

        System.out.println(it.next());

        boolean r2= it.hasNext();
        System.out.println(r2);

        System.out.println(it.next());
*/
        // instead of repeating it over and over again, you can use loop

    while (it.hasNext()){
        if(it.next()<4){
            it.remove();
        }
    }

        System.out.println(list2);

    // for loop with iterator

        System.out.println("---------------------------");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,3,4,5));
        Iterator<Integer> it2 = list3.iterator();

       for (Iterator<Integer> i = list3.iterator(); i.hasNext() ;){
           if (i.next()<4){
               i.remove();
           }
       }

        System.out.println(list3);

// REMOVE IF METHOD NOW  it creates the iterator,while loop and it already includes has next method


        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,3,4,5));

list4.removeIf(each->each<4);

        System.out.println(list4);

        // EASIEST WAY! :D is remove if

List<String > names4 = new ArrayList<>();
names4.addAll(Arrays.asList("Java","Cydeo","Car","Level", "civic","radar","kayak","reviver", "racecar"));

Iterator<String > iT = names4.iterator();

while(iT.hasNext()){
    String each = iT.next();
    String reverse = "";

    for (int i = each.length()-1; i >=0 ; i--) {
        reverse+= each.charAt(i);
    }

    if (each.equalsIgnoreCase(reverse)){
        iT.remove();
    }

}


        System.out.println(names4);


        System.out.println("--------------------------");


        List<String > names5 = new ArrayList<>();
        names5.addAll(Arrays.asList("Java","Cydeo","Car","Level", "civic","radar","kayak","reviver", "racecar"));

        Predicate<String>palindrome = str -> {
            String reverse = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse += str.charAt(i);

            }
            return reverse.equalsIgnoreCase(str);
        };



    }

}
