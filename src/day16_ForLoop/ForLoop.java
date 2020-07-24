package day16_ForLoop;

public class ForLoop {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++ ){
            if(i==3){        //burada 2 kez yazilir hello world 3. keaz break ile biter.
                break;
            }
            System.out.println("Hello World");
        }

        System.out.println("+++++++++++++++++++++++++++++++++++");

        for(int i=1; i<=5; i++ ){
            System.out.println("Hello World");
            if(i==3){
                break;
            }

        }


        for(char i='a'; i<='z'; i++){

            System.out.println(i);

            if(i=='e'){
                break;
            }
        }



















    }


}
