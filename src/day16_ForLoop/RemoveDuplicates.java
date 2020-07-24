package day16_ForLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "ABAB";

        String result = "";

        for(int i=0; i <= str.length()-1 ; i++){    // 0 , 1, 2 ,3

            /*
            if( !result.contains( ""+str.charAt(i)) ) {
                result += str.charAt(i);
            }
             */


            if(result.contains( ""+str.charAt(i) )){
                continue;
            }
               result += str.charAt(i); //only gets executed if str.charAt() is not contained the result.
        }
                System.out.println(result);

        











    }


}
