package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(5);
        list1.add(7);
        list1.add(8);

        //list1.add(6); //boyle ekleyince sonuna ekliyor.
        //{5,7,8,6} oluyor.

        list1.add(1,6); //1.index e 6 yi koydu.
       // list1.add(7,10);//out of bond oluyor bu list icin.
        list1.set(3,9); //3.elementi 9 yapar replace yapar

        System.out.println(list1);


        int [] arr={1,2,3,4}; //4 yerine 5 koymak istiyorum mesela
        arr[3]=5;

        ArrayList<String>list2=new ArrayList<>();
        list2.add("A");  //{A}
        list2.add("B");  //{A,B}
        list2.add(1,"C");//{A,C,B}
        list2.add(1,"D");//{A,D,C,B}

        System.out.println(list2);

        //Listemi {A,D,E,F} yapmak istiyorum

        list2.set(3,"F");
        list2.set(2,"E");

        System.out.println(list2);

        System.out.println("++++++++++++++++++++");
        ArrayList<Integer>list3=new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);

        // 1,2,3,4
        //int a=1;
        //list3.remove(a); //1.indexdeki 2 yi remove edelim ->1,3,4
        //list3.remove(1); //

        Integer a=1;  //object 1 will be removed
        list3.remove(a); //{2,3,4}

        System.out.println(list3);

        ArrayList<Integer>list4=new ArrayList<>();
        list4.add(10);
        list4.add(20);
        list4.add(30);

        //in order to remove 20;
        //list4.remove(1);

        Integer a2=20; //eger object yerine baska bir sayi olmayan bir sayi koyarsak mesela 100
        //boolean will be false. Otherwise, a2=20 ise boolean true olacak.
        boolean r1=list4.remove(a2); //return boolean.

        System.out.println(list4);
        System.out.println(r1);



















    }
}
