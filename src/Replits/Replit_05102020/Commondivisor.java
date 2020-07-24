package Replits.Replit_05102020;

public class Commondivisor {
    /*
    Given two positive integers m and n, find their greatest common divisor, that is, the largest positive integer
    that evenly divides both m and n.
    Example:
    if m = 15 and n = 25, then result greatest common divisor is = 5.
     */

    public static void main(String[] args) {
        System.out.println(commonDivisor(15, 25)); //5
        System.out.println(commonDivisor(40, 124)); //4
        System.out.println(commonDivisor(120, 60)); //60
        System.out.println(commonDivisor(80, 60)); //20
    }


    public static int commonDivisor(int m, int n) {
        //WRITE YOUR CODE HERE
        int divisor = 1;
        int small = 0;

        if (m < n) {
            small = m;
        } else {
            small = n;
        }

        for (int i = 1; i <= small; i++) {
            if (n % i == 0 && m % i == 0) {
                divisor = i;
            }

        }



        /*
        for(int i=small; i>=1; i--){
            if(n%i==0 && m%i==0){
                divisor = i;
                break;
            }
        }
         */


        return divisor;
    }

}






