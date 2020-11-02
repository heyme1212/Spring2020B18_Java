package day17_WhileLoop_04062020;

public class Frequency {
    public static void main(String[] args) {
       /*
       How many times JAva occured in this sentences.
        */
        String str="Java is fun, Java is cool";
        int count=0;

        while(str.contains("Java")){
            count++;
            str=str.replaceFirst("Java","");

        }

        System.out.println(count);

        




    }
}
