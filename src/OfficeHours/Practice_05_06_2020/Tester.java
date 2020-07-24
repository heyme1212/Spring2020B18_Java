package OfficeHours.Practice_05_06_2020;

public class Tester {
      /*
    create a class called Testers
			Attributes:
				name, employeeID, JobTitle, Salary
			Actions:
				setTesterInfo(), smokeTesting(),  creatingTicket();

create a class called Developers
			Attributes:
				name, employeeId, JobTitle, Salary
			Actions:
				setDeveloperInfo(), coding(), fixingBugs()

create a class called ScrumTeam
			Attributes:
				name
				List of Testers,
				List of Developers,
			Actions:
				hireTester
				fireTester
				hireDeveloper
				fireDeveloper
				DailyStandUp

create a class called Bank of America:
				Bank of America in VA is planning to create a scrum teams:
						4 developers 2 testers
				 create a arraylist of scrum team and:
						 1. use the for loop to print out every single employees from BOA' scrum teams
						 2. calculate the total budgets of the screumteam
     */

    String name;
    String jobTitle;
    double salary;
    long emloyeeId;

    public void setInfo(String name, String jobTitle, double salary, long emloyeeId) {
        this.name = name; //user given argument name is assgined to instance variable name
        //this refers to object instance
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.emloyeeId = emloyeeId;
    }

        public void smokeTesting(){
            System.out.println(this.name+" is doing the smoke testing");
        }

        public void creatingTicket(){
            System.out.println(this.name+" is creating ticket in JIRA");
        }

        public String toString(){
            return "Name: "+name+", job title: "+jobTitle
                    +", salary: $"+salary+" ID: "+emloyeeId;
        }




}
