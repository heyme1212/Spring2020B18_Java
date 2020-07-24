package day06_Shorthand_LogicalOperators;

public class ifStatementPractice {
    public static void main(String[] args){
        int a = 100;
        int b = 200;

        if(a>b){  //false
            System.out.println(a + "is greater than b");

        }
        if(b>a){    //true
            System.out.println(b +" is greater than a");

        }
        if(b==a) {   //false ====>sonuc cikmiyor.
            System.out.println(a + " is equal to "+  b);
        }

        int x = 300;
        int y = 300;
        boolean xGreater = x>y;
        boolean yGreater = y>x;

        if(xGreater){
            System.out.println(x + " is greater than "+ y);
        }

        if(yGreater) {
            System.out.println(y + " is greater than " + x);
        }

        if (xGreater == false && yGreater ==false) {
            System.out.println(x + " is equal to " + y);
        }

            if (!xGreater && !yGreater) {
                System.out.println(x + " is equal to " + y);
            }

                if (xGreater == yGreater){
                    System.out.println(x+" is equal to " + y);


            }









        }

}
