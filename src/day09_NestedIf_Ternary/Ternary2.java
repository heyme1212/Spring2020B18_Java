package day09_NestedIf_Ternary;

public class Ternary2 {
    public static void main(String[] args) {
        String result = "";
        if (9 > 10) {
            result = "9 is greater";
        } else {
            result = "10 is greater";
        }

        System.out.println(result);

        String result2 = (9 > 10) ? "9 is greater" : "10 is greater";

        System.out.println(result2);


        int age = 20;
        boolean eligibility = (age >= 21) ? true : false;
        /*if(age>21){
            eligibility=true;
        } else{
            eligibility=false;
        }

         */

        System.out.println(eligibility);


        int ageofPerson = 20;
        String eligibletoVote = "";
        if (ageofPerson >= 18) {
        eligibletoVote = "YES";
        }else {
            eligibletoVote = "NO";
        }

        System.out.println(eligibletoVote);

        String eligibletoVote2=(ageofPerson>=18) ? "YES" : "NO";
        System.out.println(eligibletoVote2);





    }



}
