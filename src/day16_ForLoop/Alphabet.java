package day16_ForLoop;

public class Alphabet {
    /*
    5. Write a program that will print out all letters in English alphabet in ascending order
	6. Write a program that will print out all letters in English alphabet in descedning order

     */
    public static void main(String[] args) {

        for(char ch1= 'A'; ch1<= 'Z'; ch1++ ){
            System.out.print(ch1+" ");
        }

        System.out.println();

        for(char ch2= 'Z'; ch2 >= 'A'; ch2--){
            System.out.print(ch2+" ");
        }

        System.out.println("++++++++++++++++++");

        String str = "AABC";
        String result="";

        int count=0;
        for(int i=0; i<str.length(); i++){

            count=0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            // check
            if(count==1){
                result+=str.charAt(i);
            }


        }

        System.out.println(result);


















    }



}
