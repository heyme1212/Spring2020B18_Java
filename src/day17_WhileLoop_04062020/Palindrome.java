package day17_WhileLoop_04062020;

public class Palindrome {
    public static void main(String[] args) {
        String str="Level";
        String reversedStr= "";  //store the reversed version

        int index= str.length()-1;

        while(index>=0){
            reversedStr+=str.charAt(index);
            index--;
        }

        System.out.println(reversedStr);

        boolean palindrome=reversedStr.equals(str);
        System.out.println(palindrome);












    }
}
