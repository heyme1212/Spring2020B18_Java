package X_FILES;

import java.util.Scanner;

public class replitreview {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int length1=word.length();

        if(length1%2 !=0){
            if(length1>=3){
                System.out.println(word.charAt(length1/2));
            }else if(length1==1){
                System.out.println(word+word+word);
            }
        }else{
            if(length1>=4){
                System.out.println(word.substring(length1/2-1,length1/2+1));
            }else if(length1==2){
                System.out.println(word+word);
            }
        }

    }
}
