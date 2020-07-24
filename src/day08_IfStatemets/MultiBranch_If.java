package day08_IfStatemets;

public class MultiBranch_If {
    public static void main(String[] args) {
/*
        int a =100;
        boolean zero= a==0;
        boolean negative = a<0;
        boolean positive = a>0;

        if(zero){
            System.out.println("zero");
        }

        if(negative){
            System.out.println("Negative");
        }

        if(positive){
            System.out.println("Positive");
        }
*/

        int a = -10;
        if(a==0){
            System.out.println("zero");
        } else if (a>0){
            System.out.println("Positive");
        } else{
            System.out.println("Negative");
        }



    }



}
