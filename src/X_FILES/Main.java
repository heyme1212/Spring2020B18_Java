package X_FILES;

public class Main {
    public static void main(String[] args) {

        System.out.println("1+1 = "+calc.plus(1,1) );
        System.out.println("1-1 = "+calc.minus(1,1) );
        palindrome166.isPalindrome(1001);
    }

}

class calc{
    public static int plus(int a, int b){
        return (a+b);
    }

    public static int minus(int a, int b){
        return (a-b);
    }


}
