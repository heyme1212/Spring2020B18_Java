package Replits.Replit_04192020;

public class BinaryConversion {
    public static void main(String[] args) {
        /*

        Scanner input = new Scanner(System.in);

        int[] binary = new int[8];
        for(int i =0; i < binary.length; i++) {
            binary[i] = input.nextInt();
        }

        //TODO: Write your code below.
        int sum=0;
        int multip=1;

        for(int i=0; i<binary.length; i++){
            multip=1;
            for(int j=binary.length-1-i; j>=1; j--){
                multip*=2;
            }
            sum+=binary[i]*multip;
        }
        System.out.println(sum);

        */

        int[] binary ={0, 0, 0, 0, 0, 0, 1, 1};

        int value=0;
        for(int j=binary.length-1; j>=0; j--){
            int product=binary[j];
            for(int i=j; i<binary.length-1; i++){
                product*=2;
            }
            value+=product;
        }
        System.out.println(value);





    }
}
