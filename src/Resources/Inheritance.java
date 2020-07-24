package Resources;

import day42_Inheritance.Data;

public class Inheritance extends Data {
    //          sub              Super

    public static void main(String[] args) {

        System.out.println(Inheritance.publicData);
        System.out.println(Inheritance.protectedData);
        //System.out.println(Inheritance.defaultData);
        //System.out.println(Inheritance.privateData);

        //public and protected are inherited from any sub class.
        //default is inherited as long as sub is in the same package.
        //private is never inherited.



    }

}
