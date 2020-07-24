package Replits.Replit_05152020;

public class CalcObjects {
    public static void main(String[] args) {
        Calc a = new Calc();
        a.setX(10);
        a.setY(5);
        a.minus();

        System.out.println(a.getResult());
        //prints: 5

        a.plus();

        System.out.println(a.getResult());
        // prints: 15




    }

}
