package OfficeHours.Practice_04_22_2020;

public class void_Method {
    public static void main(String[] args) {
        print();

        boolean USCitizen=true;
        int age=21;
        Vote(21, true);
        Vote(35, false);
        BuyCigarette(28);



    }

    public static void print(){
        for(int i=0; i<5; i++){
            System.out.println("Hello B18");
        }
    }

    public static void Vote(int age, boolean USCitizen){
        boolean eligibletoVote=age>=18&& USCitizen==true;
        if(eligibletoVote){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }
    }

    /*
    if a person eligible to buy smoke cigarette
     */
    public static void BuyCigarette(int age){
        if(age>18){
            System.out.println("eligible to buy");
        }else{
            System.out.println("you are not  eligible");
        }
    }





}
