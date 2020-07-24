package X_FILES;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class hi3 {
    public static void main(String[] args) {
        //predicate allows you to create your own conditopn based on datatype.

        //remove all the odd number
        Predicate<Integer> oddNumber= p ->p%2 !=0;
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list.removeIf(oddNumber);
        System.out.println(list);

        System.out.println("++++++++++++++++++++++++++++++++");

       //remove numbers less than 5;

        Predicate<Integer> lessthan5= y->y<5;
        ArrayList<Integer>list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.removeIf(lessthan5);
        System.out.println(list2);

        System.out.println("++++++++++++++++++++++++++++++++");

        Predicate<String> startsWithM= y->!y.startsWith("M");
        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Murtaza", "Modemmed", "Boris", "Sha", "Bilal" ));

        names.removeIf(startsWithM);
        System.out.println(names);

        System.out.println("++++++++++++++++++++++++++++++++");

        Predicate<Character> removeDigit= c-> Character.isDigit(c);
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll( Arrays.asList('A', 'B', '3', '4', '5', '@', '&', 'Z'));
        chars.removeIf(removeDigit);
        System.out.println(chars);


















    }
}
