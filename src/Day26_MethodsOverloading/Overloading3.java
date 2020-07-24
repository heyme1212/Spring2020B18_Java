package Day26_MethodsOverloading;

public class Overloading3 {
   /*
first method: can find the sum of two int numbers
second method: can find the sum of two double numbers
 */
    public static void main(String[] args) {
        sum(10,20);
        sum(2.5,1.5);
        sum(10,15.5);

        //25L+30L
        sum(25L,30L);
        //(int)25L+(int)30L-->casting yapacagiz

    }


    public static void sum(int a,int b){
        System.out.println(a+b);
    }

    public static void sum(double a,double b){
        System.out.println(a+b);
    }





}
