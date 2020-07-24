package day21_MultiDimensionalArrays;

public class ScrumTeam {
    public static void main(String[] args) {

        String[] DevTeam={"Zeynep","Haider","Jpovid","Muhtar"};
        String [] Testers={"Rahman","Aishan","Osman","Ali"};
        String[] PO={"Barzy","Donald"};
        String[] TestersTeam2={"Ilham", "Zarina", "Aizhan","Asiman"};



        String [] [] scrumTeam= {DevTeam, Testers, PO};

        //we will replace Muhtar with Jean

        scrumTeam [0][3]="Jean";

        scrumTeam[1]=TestersTeam2; //yeni team i asssign ettik buraya

        String info=scrumTeam[1][2];
        System.out.println(info);

        System.out.println("===============");

        for(String eachEmployee:scrumTeam[0]){
            System.out.println(eachEmployee);
        }

        System.out.println("===============");

        for(String eachEmployee:scrumTeam[1]){
            System.out.println(eachEmployee);
        }

        System.out.println("===============");

        for(String eachEmployee:scrumTeam[2]){
            System.out.println(eachEmployee);
        }

        System.out.println("=====================================");
        System.out.println(scrumTeam[2][1]);








    }
}
