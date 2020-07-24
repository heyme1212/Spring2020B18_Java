package day52_Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q {
    public static void main(String[] args) {

        Queue<String> q= new PriorityQueue<>(); //First in, first out.
        q.add("B");
        q.add("A");
        q.add("C");
        q.add("D");

        String str= q.poll();
        System.out.println(str);  //A
        System.out.println(q);  // B C D

        //System.out.println(q.get(0));

        //It removes in the alphabetic order
        /*
        PriorityQueue is maintaining natural order
        ArrayDeque is actually implementing the idea of Fifo from queue
         */
    }
}
