package day53_Iterator_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterating_Collection {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));

        for(int i=0; i < list.size(); i++){
            if( list.get(i) < 4){
                list.remove(i);
            }
        }

        System.out.println(list);

          /*
    it will throw ConcurrentModificationException

         */

        System.out.println("=========================================");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));
        list2.removeIf( p -> p < 4  ); //uses the iterator interface internally
        System.out.println(list2);   // [4 4 5 5]

        System.out.println("=================================");
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));
        Iterator<Integer>  it =list3.iterator();  // it has all the objects that list3 has.
        //  System.out.println(it.hasNext());    //checks if there is enough element to be iterated.
        //  System.out.println(it.next());       //it retrieves the object. it works only if hasNext is true.
        // if it hasNext() false ise it.next no such element exception throw edilir.
        while( it.hasNext() ){
            if( it.next()  < 4 ){
                it.remove();
            }
        }

        System.out.println(list3);


        System.out.println("=================================");
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));

        for(Iterator<Integer> I = list4.iterator(); I.hasNext();  ){
            if( I.next() < 4) {
                I.remove();
            }
        }

        System.out.println(list4);
    }

    }

