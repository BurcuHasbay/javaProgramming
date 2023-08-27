package day49_Collections;

import day43_Abstraction.EmployeeTask.Teacher;

import java.util.*;

public class SetInterfacePractice {
    public static void main(String[] args) {


        List<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(10,200,300,40,90,90));
        System.out.println(list + " Original order of the list");


        Set<Integer> hashSet= new HashSet<>(); // if you want to remover duplicated things, and get the unique want
        hashSet.addAll(Arrays.asList(10,200,300,40,90,90));
        System.out.println(hashSet);

        Set<Integer> linkedHashSet= new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90,90));
        System.out.println(linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(10,200,300,40,90,90));
        System.out.println(treeSet);



    }
}
