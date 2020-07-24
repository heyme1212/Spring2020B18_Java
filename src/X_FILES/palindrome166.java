package X_FILES;

import java.util.Scanner;

public class palindrome166 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();

    isPalindrome(num);

}
    public static void isPalindrome(int num){
        String str=""+num;
        String reversed="";
        for(int i=str.length()-1; i>=0; i--){
            reversed+=str.charAt(i);
        }

        if(str.equals(reversed)){
            System.out.println("yes");
        }else{
            System.out.println(false);
        }




    }
}
