package day37_Constructors;


public class ConstructorIntro {

    //constructor name has to be same with class name. Otherwise it will not compile.
    //public Method(){}, bu compile error verir mesela, cunku method is not the class name.

    public ConstructorIntro(int a){  //constructor with one argument
        System.out.println("constructor with argument of int");

    }

    public static void main(String[] args) {

        //ConstructorIntro obj= new ConstructorIntro();  //object must be created inline with existing constructor.bunun parameter i yok.
        //there is a default constructor here, even if I didn't create,compiler created for us as a default.
        //default constructor has no argument.

        ConstructorIntro obj2= new ConstructorIntro(10);

        ConstructorIntro obj3= new ConstructorIntro(20);








    }
}
