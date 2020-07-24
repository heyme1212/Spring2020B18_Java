package Resources;

import day42_Inheritance.Accessmodifiers;

public class Inheritance2 extends Accessmodifiers {
                //sub                 //super
    /*
    public variable
    protected variable
    public method
    protected method
     */

    public static void main(String[] args) {
        System.out.println(Inheritance2.publicVariable);
        System.out.println(Inheritance2.protectedVariable);
      //System.out.println(Inheritance2.defaultVariable);

        Inheritance2.publicMethod();
        Inheritance2.protectedMethod();
       //Inheritance2.defaultMethod();

    }

}
