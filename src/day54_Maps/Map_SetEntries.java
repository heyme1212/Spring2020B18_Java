package day54_Maps;

import com.sun.scenario.effect.impl.sw.java.JSWPerspectiveTransformPeer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class Map_SetEntries {

    public static void main(String[] args) {

        LinkedHashMap<String,String> fb= new LinkedHashMap<>();
        fb.put("Tester01","password1");
        fb.put("Tester02","password1"); //This is not in the list.
        fb.put("Tester02","password2"); //This one will be kept. since key is same, last one is accepted.
        fb.put("Tester03","password3");
        fb.put("Tester04","password4");
        fb.put("Tester05","password5");
        System.out.println(fb);

        System.out.println("---------------------------------------");

        fb.keySet(); //Returns all the keys from map as set type. Collection of data as set.
        //For each loop will be iterate all data types, we use for each loop

        for(String eachKey: fb.keySet()){
            System.out.println(eachKey);
           // System.out.println(eachKey+" "+fb.get(eachKey));
        }

        System.out.println("----------------------------------------");


        List<String> username= new ArrayList<>(fb.keySet());
        System.out.println(username);

        System.out.println("---------------------------------------");

        //values(): retrieves the values only

        fb.values();

        for(String eachValue: fb.values()){
            System.out.println(eachValue);
        }

        List<String> password= new ArrayList<>(fb.values());

        System.out.println(password);

















    }
}
