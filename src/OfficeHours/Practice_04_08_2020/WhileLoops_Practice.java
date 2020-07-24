package OfficeHours.Practice_04_08_2020;

public class WhileLoops_Practice {
    /*
    while(condition){
                  statements
                  }
    repeated if statement.
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Hello world");
        }

        System.out.println("+++++++++++++++");
        //iterator un olmamasi logical error dur. Not compile error.
        int z = 0;    //iterator olmayinca z will never change hep 0 olacak ve sonsuza kadar Hello world yazacak bize
        while (z <= 5) {
            System.out.println("Hello Cybertek");
            z++;


            System.out.println("+++++++++++++++");
            //iterator un olmamasi logical error dur. Not compile error.
            int z1 = 0;    //iterator olmayinca z will never change hep 0 olacak ve sonsuza kadar Hello world yazacak bize
            while (z1 <= 5) {
                z1++;
                System.out.println(z1);
            }

            //before print den once iterator olunca, once z 1 arttiracaklar,
            //sonra yazacak. Once 1 yazacak, sonra 6 olcak en son.

            System.out.println("+++++++++++++++");
            int z2 = 0;
            while (z2 <= 5) {
                System.out.println(z2);
                z2++;
            }

         /*
         numbers that can be divisible by 15. 0-100
          */

            int j = 0;
            while (j <= 100) {
                if (j % 15 == 0) {
                    System.out.print(j + " ");
                }

                j++;
            }


        }


    }

}
