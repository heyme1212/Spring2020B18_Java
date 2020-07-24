package day09_NestedIf_Ternary;

public class ageGroups_Nestedif {
    public static void main(String[] args) {

        int age=65;
        String ageGroup="" ;

        if(age<150 && age>0){
            if(age<21){
                ageGroup="Teenager";
            } else if(age<55){
                ageGroup="Adult";
            }else{
                ageGroup="Senior";
            }

        } else{
            ageGroup="Invalid Entry";
        }

        System.out.println(ageGroup);

        int age2=25;
        String ageGroup2="";








    }


}
