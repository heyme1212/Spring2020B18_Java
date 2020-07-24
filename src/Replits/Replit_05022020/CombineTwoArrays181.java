package Replits.Replit_05022020;

import java.util.ArrayList;

public class CombineTwoArrays181 {

            public static String combineRs(String[] r1, String[] r2) {

                ArrayList<String> list1 = new ArrayList<>();
                for (int i = 0; i < r1.length; i++) {
                    list1.add(r1[i]);
                }

                for (int i = 0; i < r2.length; i++) {
                    list1.add(r2[i]);
                }

                String all = "";

                for (int i = 0; i < list1.size(); i++) {
                    all += list1.get(i);
                }
                return all;
            }

            public static void main(String[] args)
            {
                String[] arr1 = {"f", "o","o"};
                String [] arr2 = {"b","a","r"};
                System.out.println(combineRs(arr1, arr2));
            }
        }












