package day37_Constructors;

public class Data {

    static int staticVariable =300;
    int instancevariable=400;

    public static void staticMethod(){

        System.out.println("static method");
    }

    public void instanceMethod(){

        System.out.println("Instance Method");
    }

    //import static day37_Constructors.Data.staticMethod;
    //how to import static method and static variable
    //you need to import them one by one.
    //import static day37_Constructors.Data.* -> imports all the static method and variable

}
