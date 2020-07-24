package day34_CustomClass;

public class Tester {
    /*
    create a class called Testers
Attributes:
    name, employeeID, JobTitle, Salary
Actions:
    setTesterInfo(), smokeTesting(),  creatingTicket();

create a class called Bank Of America:
bank of America is planning to create their automation team, there fore they are hiring three testers
create a list called AutomationTeam and store three Testers in it
write a program that can remove the tester if he/she is manual tester
write a program that can calculate the total budget of the Automation team
     */

    String name;
    long employeeID;
    String jobtitle;
    double salary;

    public void setTesterInfo(String name, long employeeID, String jobtitle, double salary){
        this.name=name;
        this.employeeID=employeeID;
        this.jobtitle=jobtitle;
        this.salary=salary;
    }

    public void smokeTesting(String name){
        System.out.println(name+" is doing smoke testing");
    }

    public void createTicket(String name){
        System.out.println(name+" is creating ticket");
    }


    public String toString(){
        return "Name: "+name+", job Title: "+jobtitle
                +", employee id: "+employeeID+", salary: "+salary;
    }








}
