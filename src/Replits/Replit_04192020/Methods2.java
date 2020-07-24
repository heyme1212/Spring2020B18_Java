package Replits.Replit_04192020;

import java.util.Scanner;

public class Methods2 {
    public static int max(int x,int  y){
        if(x>y){
            return y;
        }else{
            return x;
        }

    }

    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int y=scan.nextInt();

        int result=max(x,y);
        System.out.println(result);


    }









}
