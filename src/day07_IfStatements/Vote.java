package day07_IfStatements;

public class Vote {

    /*
    5. write a java program that can identify if a person is eligible to vote for Donald Trump
     */
    public static void main(String[] args) {


        int age = 19;
        boolean citizen = true;

        boolean eligible = age >= 18 && citizen == true;

       if(eligible == true){
           System.out.println("you are eligible to vote");
       }

        if(eligible == false){
            System.out.println("you are not eligible to vote");
        }



    }

}

