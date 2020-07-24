package day05_unary_shorthandoperators;

public class VariablesPractice {
    // byte,short, int, long --for whole numbers
    //float and double --for decimal numbers

    public static void main(String[] args){
        int a1 = 100;
        float f1 = (long) a1;
        //f1 = 100 L;
        //f1 = 100.0;

        System.out.println(f1);

        long l1 = (long)f1;
        //l1 = 100;

        System.out.println(l1);

        //Local variables needs to be initialized. They are the variables within the main method.





    }



}
