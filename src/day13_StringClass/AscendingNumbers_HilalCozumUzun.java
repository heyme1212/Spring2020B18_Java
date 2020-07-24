package day13_StringClass;

import java.util.Scanner;

public class AscendingNumbers_HilalCozumUzun {
/*
     Assignment:
write a program that asks to enter 5 numbers and prints the
numbers in ascending order
             Ex:
           5, 4, 1, 2, 3
            output:
           1, 2, 3, 4, 5
         */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 5 numbers:");

        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        int num4=input.nextInt();
        int num5=input.nextInt();

        int order1;
        int order2;
        int order3;
        int order4 = 0;
        int order5 = 0;

        // if num1 is min
        if(num1<num2 && num1<num3 && num1<num4 && num1<num5){
            order1=num1;
            if(num2<num3 && num2<num4 && num2<num5){
                order2=num2;

                if(num3<num4 && num3<num5){
                    order3=num3;
                    if(num4<num5){
                        order4=num4;
                        order5=num5;
                    }else{
                        order4=num5;
                        order5=num4;
                    }
                }else if(num4<num3 && num4<num5){
                    order3=num4;
                    if(num3<num5){
                        order4=num3;
                        order5=num5;
                    }else{
                        order4=num5;
                        order5=num3;
                    }
                }else{
                    order3=num5;
                    if(num3<num4){
                        order4=num3;
                        order5=num4;
                    }else{
                        order4=num4;
                        order5=num3;
                    }
                }

            }else if(num3<num2 && num3<num4 && num3<num5) {
                order2 = num3;
                if(num2<num4 && num2<num5){
                    order3=num2;
                    if(num4<num5){
                        order4=num4;
                        order5=num5;
                    }else{
                        order4=num5;
                        order5=num4;
                    }
                }else if(num4<num2 && num4<num5){
                    order3=num4;
                    if(num2<num5){
                        order4=num2;
                        order5=num5;
                    }else{
                        order4=num5;
                        order5=num2;
                    }
                }else{
                    order3=num5;
                    if(num2<num4){
                        order4=num2;
                        order5=num4;
                    }else{
                        order4=num4;
                        order5=num2;
                    }
                }

            }else if(num4<num2 && num4<num3 && num4<num5){
                order2=num4;
                if(num2<num3 && num2<num5){
                    order3=num2;
                    if(num3<num5){
                        order4=num3;
                        order5=num5;
                    }else{
                        order4=num5;
                        order5=num3;
                    }
                }else if(num3<num2 && num3<num5){
                    order3=num3;
                    if(num2<num5){
                        order4=num2;
                        order5=num5;
                    }else{
                        order4=num5;
                        order5=num2;
                    }
                }else{
                    order3=num5;
                    if(num2<num3){
                        order4=num2;
                        order5=num3;
                    }else{
                        order4=num3;
                        order5=num2;
                    }
                }
            }else{
                order2=num5;
                if(num2<num3 && num2<num4){
                    order3=num2;
                    if(num3<num4){
                        order4=num3;
                        order5=num4;
                    }else{
                        order4=num4;
                        order5=num3;
                    }
                }else if(num3<num2 && num3<num4){
                    order3=num3;
                    if(num2<num4){
                        order4=num2;
                        order5=num4;
                    }else{
                        order4=num4;
                        order5=num2;
                    }
                }else{
                    order3=num4;
                    if(num2<num3){
                        order4=num2;
                        order5=num3;
                    }else{
                        order4=num3;
                        order5=num2;
                    }
                }
            }


        //  if num2 is min;
        }else if(num2<num1 && num2<num3 && num2<num4 && num2<num5){
            order1=num2;
            if(num1<num3 && num1<num4 && num1<num5){
                order2=num1;
                if(num3<num4 && num3<num5){
                    order3=num3;
                    if(num4<num5){
                        order4=num4;
                        order5=num5;
                    }else {
                        order4 = num5;
                        order5 = num4;
                    }

                }else if(num4<num3 && num4<num5){
                    order3=num4;
                    if(num3<num5){
                        order4=num3;
                        order5=num5;
                    }else {
                        order4 = num5;
                        order5 = num3;
                    }
                }else{
                    order3=num5;
                    if(num3<num4){
                        order4=num3;
                        order5=num4;
                    }else {
                        order4 = num4;
                        order5 = num3;
                    }
                }

            }else if(num3<num1 && num3<num4 &&num3<num5) {
                order2 = num3;
                if(num1<num4 && num1<num5){
                    order3=num1;
                    if(num4<num5){
                        order4=num4;
                        order5=num5;
                    }else{
                        order4 = num5;
                        order5 = num4;
                    }

                }else if(num4<num1 && num4<num5){
                    order3=num4;
                    if(num1<num5){
                        order4=num1;
                        order5=num5;
                    }else {
                        order4 = num5;
                        order5 = num1;
                    }
                }else{
                    order3=num5;
                    if(num1<num4){
                        order4=num1;
                        order5=num4;
                    }else {
                        order4 = num4;
                        order5 = num1;
                    }
                }

            }else if(num4<num1 && num4<num3 &&num4<num5){
                order2=num4;
                if(num1<num3 && num1<num5){
                    order3=num1;
                    if(num3<num5){
                        order4=num3;
                        order5=num5;
                    }else {
                        order4 = num5;
                        order5 = num3;
                    }
                }else if(num3<num1 && num3<num5){
                    order3=num3;
                    if(num1<num5){
                        order4=num1;
                        order5=num5;
                    }else {
                        order4 = num5;
                        order5 = num1;
                    }

                }else{
                    order3=num5;
                    if(num1<num3){
                        order4=num1;
                        order5=num3;
                    }else {
                        order4 = num3;
                        order5 = num1;
                    }
                }

            }else{
                order2=num5;
                if(num1<num3 && num1<num4){
                    order3=num1;
                }else if(num3<num1 && num3<num4){
                    order3=num3;
                }else{
                    order3=num4;
                }
            }

         // if num3 is min:
        }else if(num3<num1 && num3<num2 && num3<num4 && num3<num5){
            order1=num3;
            if(num1<num2 && num1<num4 && num1<num5){
                order2=num1;
                if(num2<num4 && num2<num5){
                    order3=num2;
                }else if(num4<num2 && num4<num5){
                    order3=num4;
                }else{
                    order3=num5;
                }
            }else if(num2<num1 && num2<num4 &&num2<num5) {
                order2 = num2;
                if(num1<num4 && num1<num5){
                    order3=num1;
                }else if(num4<num1 && num4<num5){
                    order3=num4;
                }else{
                    order3=num5;
                }
            }else if(num4<num1 && num4<num2 &&num4<num5){
                order2=num4;
                if(num1<num2 && num1<num5){
                    order3=num1;
                }else if(num2<num1 && num2<num5){
                    order3=num2;
                }else{
                    order3=num5;
                }
            }else{
                order2=num5;
                if(num1<num2 && num1<num4){
                    order3=num1;
                }else if(num2<num1 && num2<num4){
                    order3=num2;
                }else{
                    order3=num4;
                }
            }

        // if num4 is min:
        }else if(num4<num1 && num4<num2 && num4<num3 && num4<num5){
            order1=num4;

            if(num1<num2 && num1<num3 && num1<num5){
                order2=num1;
                if(num2<num3 && num2<num5){
                    order3=num2;
                }else if(num3<num2 && num3<num5){
                    order3=num3;
                }else{
                    order3=num5;
                }

            }else if(num2<num1 && num2<num3 &&num2<num5) {
                order2 = num2;
                if(num1<num3 && num1<num5){
                    order3=num1;
                }else if(num3<num1 && num3<num5){
                    order3=num3;
                }else{
                    order3=num5;
                }
            }else if(num3<num1 && num3<num2 &&num3<num5){
                order2=num3;
                if(num1<num2 && num1<num5){
                    order3=num1;
                }else if(num2<num1 && num2<num5){
                    order3=num2;
                }else{
                    order3=num5;
                }
            }else{
                order2=num5;
                if(num1<num2 && num1<num3){
                    order3=num1;
                }else if(num2<num1 && num2<num3){
                    order3=num2;
                }else{
                    order3=num3;
                }
            }

        // if num5 is min;
        }else {
            order1 = num5;
            if (num1 < num2 && num1 < num3 && num1 < num4) {
                order2 = num1;
                if (num2 < num3 && num2 < num4) {
                    order3 = num2;
                } else if (num3 < num2 && num3 < num4) {
                    order3 = num3;
                } else {
                    order3 = num4;
                }
            } else if (num2 < num1 && num2 < num3 && num2 < num4) {
                order2 = num2;
                if (num1 < num3 && num1 < num4) {
                    order3 = num1;
                } else if (num3 < num1 && num3 < num4) {
                    order3 = num3;
                } else {
                    order3 = num4;
                }
            } else if (num3 < num1 && num3 < num2 && num3 < num4) {
                order2 = num3;
                if (num1 < num2 && num1 < num4) {
                    order3 = num1;
                } else if (num2 < num1 && num2 < num4) {
                    order3 = num2;
                } else {
                    order3 = num4;
                }
            } else {
                order2 = num4;
                if (num1 < num2 && num1 < num3) {
                    order3 = num1;
                } else if (num2 < num1 && num2 < num3) {
                    order3 = num2;
                } else {
                    order3 = num3;
                }
            }


        }






        System.out.print(order1 + ", "+ order2 + ", "+ order3 + ", " + order4 + ", " + order5);








    }



}







