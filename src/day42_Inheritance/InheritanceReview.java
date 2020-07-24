package day42_Inheritance;

class B{
    public B(int a){

        System.out.println("int");
    }
    public B(double b){

        System.out.println("double");
    }

    public B(long a){
      //  this(4.5); One constructor can call only one constructor.
        this(10);
        System.out.println("long");
        //this(10.5);
    }
}


public class InheritanceReview extends B {

    public InheritanceReview(String a){
        //super(4); //int
        super(4L); //long
        System.out.println("String");
    }

    public static void main(String[] args) {

        InheritanceReview obj= new InheritanceReview("Hello");
    }

}
