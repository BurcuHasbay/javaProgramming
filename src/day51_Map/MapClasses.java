package day51_Map;

import javax.print.attribute.HashPrintRequestAttributeSet;
import java.util.*;

public class MapClasses {
    public static void main(String[] args) {
        //MAP ONLY ACCEPTS PAIRS
         // key     value
        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(10,"Arthur");
        hashMap.put(20,"George");
        hashMap.put(3,"Jack");
        hashMap.put(40,"Emma");
        hashMap.put(5,"Isabella");
        hashMap.put(7,"Osman");
        hashMap.put(8,"Osman");
        hashMap.put(1,"Osman");

        System.out.println("hasMap= "+hashMap);
        System.out.println("----------------------------");

        Map<Integer,String> linkedHashMap= new LinkedHashMap<>();
        linkedHashMap.put(10,"Burcu");
        linkedHashMap.put(25,"George");
        linkedHashMap.put(55,"Emma");
        linkedHashMap.put(41,"Osman");
        linkedHashMap.put(40,"Burcu ");

        System.out.println("LinkedHasMap= "+linkedHashMap);

        System.out.println("---------------");

        Map<Integer,String> treeMap= new TreeMap<>();
        treeMap.put(2,"Aycecül");
        treeMap.put(3,"İpek");
        treeMap.put(44,"Esra");
        treeMap.put(68,"Alev");
        treeMap.put(32,"Yasemin");
        treeMap.put(6,"Cancu");
        treeMap.put(99,"Cancu");
      //  treeMap.put(null,"Gigi"); DOES NOT ACCEPT NULL

        System.out.println("TreeMap= " +treeMap);
        System.out.println("---------------------------");

        Map<Integer,String> hashtable = new Hashtable<>();
       hashtable.put(33,"Chris");
       hashtable.put(22,"Nurten");
       hashtable.put(12,"Okan");
       hashtable.put(1,"Yaşar");

        System.out.println("HasMapTable= " + hashtable);

        //new command

    }
}
