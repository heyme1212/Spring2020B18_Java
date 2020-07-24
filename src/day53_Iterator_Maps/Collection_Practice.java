package day53_Iterator_Maps;

import java.util.*;

public class Collection_Practice {
    /*
    1. write a program that remove the duplicates from an array of String
	2. write a program that can remove the duplicates from an arrayList of String
	3. what are the differences between List and Set
			List: Accepts duplicates
			Set:
	 4. how to achieve thread safety
     */
    public static void main(String[] args) {
        //Is there any way to make the array list synchronized?
        // We can use from java.util package collections utility class.
        // Collections.synchronizedList, Collections.synchronizedSet() ve map versiyonlari da vardir/

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list = Collections.synchronizedList(list);  //thread-safe

        Set<Integer> set = new HashSet<>();
        set = Collections.synchronizedSet(set); // thread-safe


        String[] arr = {"E", "B", "A", "D", "D", "C", "A"}; //keep the order, remove the duplicates

        LinkedHashSet<String> st = new LinkedHashSet<>(Arrays.asList(arr)); //Array i array list e cevirdik array.asList ile.
        System.out.println(st);

        /*
        for(String each: arr){
            st.add(each);
        }
        */

        ArrayList<String> arrayList= new ArrayList<String>(Arrays.asList("E", "B", "A", "D", "D", "C", "A"));
        LinkedHashSet<String> st2= new LinkedHashSet<>(arrayList);
        System.out.println(st2);

    }

    public synchronized void append(){

    }




}
