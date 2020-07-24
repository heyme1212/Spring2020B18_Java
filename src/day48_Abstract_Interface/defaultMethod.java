package day48_Abstract_Interface;

//default method is a special method that ony interface can have.
//You cant create it anywhere but in interface only.

abstract class T{
  //  public default void method2(){}

}



public interface defaultMethod {
    default void method(){    //only for interface
        System.out.println("Default method");
    }

    public static void main(String[] args) {
       // method();  //this method is not static
      // defaultMethod obj= new defaultMethod();  //cant create object of the interface.

    }
}

class N implements defaultMethod{
    public static void main(String[] args) {

        N obj= new N();  //Default method is executed only after it is inherited. 
        obj.method();
    }
}




