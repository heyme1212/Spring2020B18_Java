package Replits.Replit_04192020;

import java.util.Scanner;

public class Method154 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            isPalindrome(num);
        }

        public static void isPalindrome(int num){
            //WRITE YOUR CODE HERE
            String str=""+num;
            String reversedstr="";
            for(int i=str.length()-1; i>=0; i--){
                reversedstr+=str.charAt(i);
            }

            if(str.equals(reversedstr)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }


            /*
            String newnum="";
            while(num>0){
               newnum+=num%10;
               num=num/10;
            }

            System.out.println(newnum);

            String newnumrev="";
            for(int i=newnum.length()-1; i>=0; i--){
                newnumrev+=""+newnum.charAt(i);
            }

            boolean result=true;

            if(newnumrev.equals(newnum)){
                System.out.println(result);
            }else{
                System.out.println(!result);
            }

            /*
            int num1=0;
               int num2=num;
             while (num2 !=0) {
             num1 = num1*10 + num2%10;
             num2 = num2/10;
                   }
                  if(num==num1){System.out.println(true);}
                  else{System.out.println(false);}
             */








        }
}
