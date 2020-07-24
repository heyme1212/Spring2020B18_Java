package OfficeHours.Practice_05_06_2020;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleINC {
    public static void main(String[] args) {
        Tester tester1=new Tester();
        tester1.setInfo("Onur","Junior Tester",75000,1234);
        Tester tester2=new Tester();
        tester2.setInfo("Elton John","Junior Tester",75000,1245);
        Tester tester3=new Tester();
        tester3.setInfo("Rahman","SDET",120000,22222);

        ScrumTeam scrum1=new ScrumTeam();
        scrum1.hireATester(tester3);
        scrum1.hireATester(tester2);
        scrum1.hireATester(tester1);

        scrum1.fireATester(1245);

        //scrum1.testersteam//returns the testersTeam arraylist from scrum1.

        for( Tester each :scrum1.testersTeam){
            System.out.println(each);
        }

        System.out.println("=======================");

        Developer dev1=new Developer();
        dev1.setInfo("Barzy","Senior Developer",220200,1122337);

        Developer dev2=new Developer();
        dev2.setInfo("Emrah", "Usta Developer", 100000,223232);

        scrum1.hireADeveloper(dev1);
        scrum1.hireADeveloper(dev2);

        scrum1.fireADeveloper(1122337);

        System.out.println(scrum1.devpTeam.size());

        for(Developer each :scrum1.devpTeam){
            System.out.println(each);
        }

        System.out.println("========================");

        System.out.println("In my scrum team, We have "+scrum1.testersTeam.size()
                +" testers and "+scrum1.devpTeam.size()+" developers");

        System.out.println("=================SCRUMTEAM2=====================");

        ScrumTeam scrum2=new ScrumTeam();

        Tester tester4=new Tester();
        tester4.setInfo("Allison","Junior SDET", 90000, 14589);

        Tester tester5=new Tester();
        tester5.setInfo("Jack","Senior SDET", 130000, 98745);

        scrum2.hireATester(tester4);
        scrum2.hireATester(tester5);

        Developer dev3=new Developer();
        dev3.setInfo("Olivia", "Senior Developer", 120000,51547);

        Developer dev4=new Developer();
        dev4.setInfo("Robert", "Junior Developer", 100000, 45213);

        Developer dev5=new Developer();
        dev5.setInfo("Sara", "Junior Developer", 104000,48973);

        Developer dev6=new Developer();
        dev6.setInfo("Jack", "Senior Developer", 115000, 87425);

        scrum2.hireADeveloper(dev3);
        scrum2.hireADeveloper(dev4);
        scrum2.hireADeveloper(dev5);
        scrum2.hireADeveloper(dev6);

        System.out.println("================SCRUMTEAM3==================");

        ScrumTeam scrum3=new ScrumTeam();

        Tester tester6=new Tester();
        tester6.setInfo("Megan", "Senior SDET", 110000, 745627);

        Tester tester7=new Tester();
        tester7.setInfo("Robert","Senior SDET", 108000, 857464);

        Tester tester8=new Tester();
        tester8.setInfo("Rachel","Junior SDET", 101000, 65241);

        scrum3.hireATester(tester6);
        scrum3.hireATester(tester7);
        scrum3.hireATester(tester8);

        Developer dev7=new Developer();
        dev7.setInfo("Sophia", "Senior Developer", 135000, 23457);
        Developer dev8=new Developer();
        dev8.setInfo("Emma", "Senior Developer", 129000, 23458);
        Developer dev9=new Developer();
        dev9.setInfo("Noah", "Junior Developer", 95000, 23459);
        Developer dev10=new Developer();
        dev10.setInfo("Mia", "Junior Developer", 99000, 24569);
        Developer dev11=new Developer();
        dev11.setInfo("Liam", "Senior Developer", 126000, 27951);

        scrum3.hireADeveloper(dev7);
        scrum3.hireADeveloper(dev8);
        scrum3.hireADeveloper(dev9);
        scrum3.hireADeveloper(dev10);
        scrum3.hireADeveloper(dev11);

        ScrumTeam [] scrumsArray= {scrum1, scrum2, scrum3};

        for(ScrumTeam eachScrum: scrumsArray){
            for(Tester eachTester:eachScrum.testersTeam){
                if(eachTester.salary>120000){
                    System.out.println(eachTester.name);
                }
            }
        }

        for(ScrumTeam eachScrum: scrumsArray){
            for(Developer eachDev:eachScrum.devpTeam){
                if(eachDev.salary<120000){
                    System.out.println(eachDev.name);
                }
            }
        }


        ArrayList<ScrumTeam> scrumsList=new ArrayList<>();
        scrumsList.addAll(Arrays.asList(scrum1,scrum2,scrum3));


        for(ScrumTeam eachScrum: scrumsList){
            eachScrum.testersTeam.removeIf(p->p.salary<100000);
            eachScrum.devpTeam.removeIf((p->p.salary<120000));
        }


    }
}


/*
      create scrum2: 4 developers, 2 testers
      create scrum3: 5 developers, 3 testers
      create an array of scrum: {scrum1, scrum2, scrum3};
          1. iterator the array to print out all the testers who have salary > 120000
          2. print out all the developers who have salary < 120000
      create an ArrayList of scrum: {scrum1, scrum2, scrum3};
             1. remove all the testers who have salary < 100000
             2. remove all the developers who have salary < 120000
         NOTE: DO NOT create any ArrayList of Testers or Developers.
              Use the ArrayLists in ScrumTeam class only
       */


