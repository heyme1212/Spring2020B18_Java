package day46_Final_Abstract;

public class final_Variables {

    final int InstanceVariable=300;

    int InstanceVariable2; //burada compile gives the default value, int oldugu icin 0 olacakti.
    //however, final ile yazsaydim, it needs to be initialized immediately.

    //final int InstanceVariable3; boyle birakamam, initialize etmem lazim. compile error veriyor.
    final int InstanceVariable3=300;

    final static int staticVariable=1000;

    //final static int getStaticVariable;
    //static and instance variables with final should be initialized immediately.
    //yoksa compile error verir.

    public static void main(String[] args) {
        // Local variable examples:
       // double PI=3.14; final olmayinca reassign yapabilirz ama sabit bir sayi tabiki bu.
       // PI=3.15; //we can reassign it now but not after giving final.

        final double PI=3.14;
       // PI=3.15; //compile error verdi after final. you cant reassign

        final String gender="Male"; //final is a specifier
        //gender="Female"; compile error

        final int score;
        //System.out.println(score); before assigning anything, after line 31, score gives compile error.

        score=100; //you can initialize final variable only one time.
       // score=200; I cant reassign 100 to 200 here.
        System.out.println(score);

        System.out.println("=========================");

      //  this.InstanceVariable=400; couldn't call it.

        final_Variables obj= new final_Variables();
       // obj.InstanceVariable=400;

       // staticVariable=2000; I cant reassign it, basta 1000 verdim.





    }
}
