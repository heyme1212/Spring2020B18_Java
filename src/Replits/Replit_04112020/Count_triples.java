package Replits.Replit_04112020;
import java.util.Scanner;
public class Count_triples {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;

        for(int i=0; i<=str.length()-3; i++){
            if(str.charAt(i)==str.charAt(i+1) && str.charAt(i)==str.charAt(i+2)){
                count++;
            }
        }

        System.out.println(count);
















       /*

        char [] ch = str.toCharArray();
        for (int i =0; i < ch.length-2; i++){
            if (ch[i]== ch[i+1] && ch[i] == ch[i+2]){
                count++;
            }
        }
        System.out.println(count);


        */






    }
}
