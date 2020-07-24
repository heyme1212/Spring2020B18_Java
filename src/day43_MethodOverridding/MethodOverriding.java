package day43_MethodOverridding;

class Test{
   public void method(){
        System.out.println("Onur");
    }
}



/*
because Static has only one copy
because constructor should have exactly same name with class/
 */
public class MethodOverriding extends Test {
    @Override
    public void method(){
        System.out.println("Zarina");
    }

    public static void main(String[] args) {
        Test obj1=new Test();
        obj1.method();

        MethodOverriding obj2=new MethodOverriding();
        obj2.method();


    }

}
