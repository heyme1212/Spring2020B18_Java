package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObject {
    public static void main(String[] args) {
        Carpet carpet1=new Carpet();
        Carpet carpet2=new Carpet();

        carpet1.customOrder(2, 3, 100, true);
        carpet2.customOrder(2, 3, 100, false);

        System.out.println(carpet1);
        System.out.println(carpet2);

        Carpet [] carpets={new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};
        carpets[0].customOrder(7,8.5,20,true);
        carpets[1].customOrder(10, 15,30,false);
        carpets[2].customOrder(9,20,15,true);
        carpets[3].customOrder(20,18,15,false);
        carpets[4].customOrder(35,45,35,true);

        System.out.println(carpets[0]);
        System.out.println(carpets[1]);
        System.out.println(carpets[2]);
        System.out.println(carpets[3]);
        System.out.println(carpets[4]);

        //carpets arrayindaki persian carpetlari persiancarpets listesine ekliyoruz.
        ArrayList<Carpet>persianCarpets=new ArrayList<>();
        for(Carpet each:carpets){
            if(each.isPersian){
                persianCarpets.add(each);
            }
        }

        //size of the array list the # of persian carpets. persiancarpets.size()
        System.out.println("There are "+persianCarpets.size()+" persian carpets");
        System.out.println(persianCarpets.get(0).calcCost());
        System.out.println(persianCarpets.get(1).calcCost());

        ArrayList<Carpet> regularCarpets = new ArrayList<>(Arrays.asList(carpets) );
        //regularCarpets.removeAll(persianCarpets);
        regularCarpets.removeIf( p -> p.isPersian );

        System.out.println("There are "+regularCarpets.size()+" regular carpets");
        System.out.println(regularCarpets.get(0).calcCost());

        for(int i = 0; i < regularCarpets.size(); i++){
            System.out.println( regularCarpets.get(i).calcCost()  );
        }























    }
}
