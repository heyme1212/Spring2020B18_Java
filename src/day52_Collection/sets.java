package day52_Collection;

import java.util.*;

public class sets {

    public static void main(String[] args) {
        Set<String> names= new HashSet<>();
        //It doesn't accept duplicates, theo order different than your insertion order.
        names.add("Sha");
        names.add("Zuura");
        names.add("Saban");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");

        System.out.println(names);   //[Zuura, Ozgur, Sha, Saban]

        //Linked HashSet has the order of insertion. It still doesnt accept duplicates.
        Set<String> names1= new LinkedHashSet<>();
        names.add("Sha");
        names.add("Zuura");
        names.add("Saban");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");

        System.out.println(names1);

        String [] arr= {"A","A","C","B","A"}; //Remove duplicates: The order should be ACB
        //In order to keep the insertion order, I use LinkedHashSet

        LinkedHashSet<String> set1= new LinkedHashSet<>(Arrays.asList(arr));

        System.out.println(set1);
        //System.out.println(set1.get(0));
        //Size of the set is dynamic

        //Hashset is giving random, Treeset gives alphabetic order
        //Hashset accepts null. Null keyword


        //  System.out.println( set1.get(1) );

        System.out.println("=========================================");

        Set<Integer> numbers = new TreeSet<>();
        numbers.addAll( Arrays.asList(10,9,10, 9, 8, 7, 8, 7, 6, 5, 6));
        System.out.println(numbers);
        //It will remove the duplicates and print in sorted order.
        //Also, Treeset it doesn't accept null.

        System.out.println("==========================");

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(null);
        System.out.println(hashSet);

        System.out.println("==========================");
        TreeSet<String> treeset = new TreeSet<>();
      //  treeset.add(null); //NullPointerException
        System.out.println(treeset);

    }
}
