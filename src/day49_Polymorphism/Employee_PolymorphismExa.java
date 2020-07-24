package day49_Polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

abstract class Employee {
    String name;
    long id;
    String jobTitle;
    double salary;

    public abstract void work();

    public String toString(){
        return "Name: "+name+", JobTitle: "+jobTitle+", Salary: "+salary+", id: "+id;
    }
}

class Tester extends Employee{
    public Tester(String name,String jobTitle,long id, double salary){
        this.name=name;
        this.id=id;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }

    @Override
    public void work() {
        System.out.println("Tester tests the test cases");
    }
}

class Developer extends Employee{
    public Developer(String name,String jobTitle,long id, double salary){
        this.name=name;
        this.id=id;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }
    @Override
    public void work() {
        System.out.println("Developer writes the code");
    }
}
class scrumTeam{
    //3 testers and 4 Developers in ArrayList
    //Remove developers who are making under 100K
    public static void main(String[] args) {
        Employee tester1= new Tester("Ali","SDET",123456,110000);
        Employee tester2= new Tester("Ayse", "SDET", 123457,125000);
        Employee tester3= new Tester("Mehmet","QA",123458,98000);

        Employee dev1= new Developer("Gizem","Developer",2345678,110000);
        Employee dev2= new Developer("Fatih","Senior Developer",2345679,130000);
        Employee dev3= new Developer("Mustafa","Junior Developer",23456781,100000);
        Employee dev4= new Developer("Elif","Junior Developer",23456782,95000);

        ArrayList<Employee>scrumTeam=new ArrayList<>();
        scrumTeam.addAll(Arrays.asList(tester1,tester2,tester3,dev1,dev2,dev3,dev4));

        for(Employee each: scrumTeam){
            System.out.println(each);
        }

        System.out.println(scrumTeam.size());  //7

        for(int i=0; i<scrumTeam.size();i++){
            if(scrumTeam.get(i).salary<100000){
                scrumTeam.remove(i);
            }
        }

        System.out.println(scrumTeam.size());  //5

    }
}