package day49_Collections;

import java.util.*;

public class QueuePractice {
    public static void main(String[] args) {


        Queue<Integer> priorityQueue= new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("Priority Queue" + priorityQueue);

       Queue<Integer> arrayDeque = new ArrayDeque<>();
       arrayDeque.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("ArrayDeque" + arrayDeque);

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10,200,300,40,90));


        System.out.println("Linked List" + linkedList);


        System.out.println("-----------------------");

        priorityQueue.poll(); // first-in, first out
        System.out.println(priorityQueue);
        System.out.println("PriorityQueue = " + priorityQueue);

       priorityQueue.poll();
        System.out.println("PriorityQueue = "+priorityQueue);

      linkedList.poll();
        System.out.println("LinkedList = "+linkedList);


        System.out.println("--------------------------");

        //DOWN CASTING IS NEEDED HERE

        System.out.println(((LinkedList<Integer>)linkedList).get(1));

    }
}
