package day18_NestedLoop;

public class do_While_Loop2 {
    public static void main(String[] args) {

        int number=103;    //print the number between 100 and number
        while(number>=100){             //no iteration so goes infinite
            System.out.print(number);
            number--;
        }

        System.out.println("++++++++++++++");
        int number2=103;
        do{
            System.out.print(number2);
            number2--;
        }while(number2>=100);

        System.out.println("++++++++++++++");
        int z=1;              //3 den sonra yazma dedik

        do{
            System.out.println(z);
            if(z==3){
                break;
            }
            z++;
        }while(z<=5);


        System.out.println("++++++++++++++");

        int y=1;         //3 u skip et dedik
        do{
            if(y==3){
                y++;
                continue;
            }
            System.out.println(y);
            y++;

        }while(y<=5);









    }
}
