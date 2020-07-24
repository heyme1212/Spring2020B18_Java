package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;

public class ScrumTeam {
        //ArrayList is an instance variable for ScrumTeam class
        ArrayList<Tester> testersTeam=new ArrayList<>();

        ArrayList<Developer> devpTeam=new ArrayList<>();

        public void hireATester(Tester tester){
            testersTeam.add(tester);
        }

        public void fireATester(long ID){
            testersTeam.removeIf(p-> p.emloyeeId==ID);
        }

        public void hireADeveloper(Developer developer){
            devpTeam.add(developer);
        }

        public void fireADeveloper(long id){
            devpTeam.removeIf(p->p.emloyeeId==id);
        }




}
