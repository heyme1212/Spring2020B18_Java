package X_FILES;

public class StaticVariables {
          static String name;
          static double num;

          public static void method1(){
              System.out.println("Open the browser");
          }

    public static void main(String[] args) {

        StaticVariables obj= new StaticVariables();

        StaticVariables.method1();

        obj.name="Omer";

        System.out.println(obj.name);

        StaticVariables obj2= new StaticVariables();
        obj2.name="Kursat";
        System.out.println(obj2.name);

        System.out.println(obj.name);

       StaticVariables obj4= new StaticVariables();
        System.out.println(obj4.num);


    }
}
