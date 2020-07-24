package day15_ForLoop;

public class ReverseString {
    public static void main(String[] args) {
/*
     String str="Java";
      first method
        String reverse1= ""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
        System.out.println(reverse1);
      second method
        String reverse2=str.substring(3)+str.substring(2,3)+str.substring(1,2)+str.substring(0,1);
        System.out.println(reverse2);

 */
       String str="Java";
       int lastIndexNum=str.length()-1;

       String reverse2="";
       for(int i=lastIndexNum; i>=0; i--){
           //System.out.print(str.charAt(i));
          reverse2+=str.charAt(i);
           System.out.println(reverse2);
       }





    }
}
