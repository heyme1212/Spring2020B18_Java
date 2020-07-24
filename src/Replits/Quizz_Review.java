package Replits;

public class Quizz_Review {
    public static void main(String[] args) {

        String str="Hello World";
        str.trim();
        int z=str.indexOf(" ");
        System.out.println(z);

        String str1="Java";
        String str2=new String("Java");
        if(str1.equalsIgnoreCase(str2)){
            System.out.println(true);
        }


        int i =0;
        for( i = 5; i < 10; ){
            i += 2;
            System.out.println(i);

        }



    }
}
