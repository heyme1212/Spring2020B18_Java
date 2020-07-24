package day52_Collection;

import java.util.*;

public class Lists {
    public static void main(String[] args) {

        //List<Integer> list0= new List<>();

        List<Integer> list1= new ArrayList<>();
        //ArrayList is inheriting from List. Array based class.Singly linked
        //Reference type decides what to accessible.
        //We use much arraylist, it is singly linked.it means fast to retrieve data(get()).
        //Adding and removing slow(adjusting the size)
        list1.add(1);

        List<Integer> list2= new LinkedList<>();
        //doubly linked Linked list. It is slow to retrieve that data,
        //it has advantages over the singly linked. Adding removing is faster(remove(), add() )

        list2.add(10);
        list2.remove(0);

        System.out.println("-----------------------------");

        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(10);


        Vector<Integer> vector= new Vector<>();
        vector.add(10);
        //Actions of vector is synchronized.Array based.

        //synchronized: Method or block can implement it. Used for achieving thread safety in multi thread environment.
        //Thread-safety: process of operation system scheduling the object. CPU has threads.
        //Thread safety means one by one

        Stack<Integer> stack= new Stack();
        stack.add(10);

        System.out.println("-----------------------------");
        Stack<String> names= new Stack();

        names.add("Sha");
        names.add("Dovran");
        names.add("Rahman");
        names.add("Anna");
        names.add("Rustem");
        System.out.println(names);


        String s1= names.pop(); // Rustem. Last in first out. Returns the last added one and remove it from the list.
        System.out.println(s1);
        System.out.println(names); //Sha,Dovran and Rahman ve Anna var.

        String s2= names.pop(); // Anna. Last in first out. Returns the last added one and remove it from the list.
        System.out.println(s2);
        System.out.println(names); //listede artik sadece Sha,Dovran and Rahman var.

        names.push("Phu"); //push addes the item to the list.
        System.out.println(names);


























    }
}
