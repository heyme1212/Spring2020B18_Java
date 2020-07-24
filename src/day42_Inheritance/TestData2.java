package day42_Inheritance;

public class TestData2 extends Accessmodifiers {
    //Since this sub class is in the same package,
    //public private and default are inherited.

    public static void main(String[] args) {
        System.out.println(TestData2.publicVariable);
        System.out.println(TestData2.protectedVariable);
        System.out.println(TestData2.defaultVariable);
        //System.out.println(TestData2.privateVariable);


        TestData2.publicMethod();
        TestData2.protectedMethod();
        TestData2.defaultMethod();

        publicMethod();
        protectedMethod();
        defaultMethod();


    }

}
