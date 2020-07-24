package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects {
    public static void main(String[] args) {
        Cat cat1=new Cat();
        cat1.setCatInfo("Siemes","White",2,"Sasha");
        System.out.println(cat1);

        Cat cat2=new Cat();
        cat2.setCatInfo("Scottish","Beige",7,"Bobo");

        Cat cat3=new Cat();
        cat3.setCatInfo("Calico","brown-white",6,"Cinnamon");

        ArrayList<Cat>catlist=new ArrayList<>();
        catlist.addAll(Arrays.asList(cat1,cat2,cat3));

        for(int i=0; i<catlist.size();i++){
            System.out.println(catlist.get(i));
        }

        System.out.println("+++++++++++++++++++++++++++++++++");

        cat1.sleep();
        cat2.sleep();
        cat3.sleep();

        System.out.println("++++++++++++++++++++++++++++++++++");
        cat1.eat("cat treats");
        cat2.eat("fish");
        cat3.eat("sish kabab");

        System.out.println("+++++++++++++++++++++++++++++++++++");

        cat1.drink("water");
        cat2.drink("milk");
        cat3.drink("coffee");




    }
}
