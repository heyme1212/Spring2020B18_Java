package day46_Final_Abstract;

import X_FILES.EmployeeInfo;

public abstract class Employee {
    /*
    Task02:
		1. create an abstract class called Employee
				attributes: name, age, gender, salary, jobtitle
				methods:
						abstract methods: work()
						instance method: toString()
		2. create two sub classes of the Employee:
									1. Tester
									2. Developer
					each class MUST have constructors to initialize the attributes
     */

    String name;
    int age;
    char gender;
    double salary;
    String jobTitle;

    public abstract void work();

    public String toString(){
        return "Name is: "+name+", Age is: "+age+", Salary is: $"+salary+", Job Title is "+jobTitle+", Gender: "+gender;
    }
}

class Tester extends Employee {
    public Tester(String name, String jobTitle, double salary, int age, char gender){
        this.name=name;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.age=age;
        this.gender=gender;
    }

    @Override
    public void work() {
        System.out.println(name+" is working since 2019");
    }
}

class Developer extends Employee{
    public Developer (String name, String jobTitle, double salary, int age, char gender){
        this.name=name;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.age=age;
        this.gender=gender;
    }

    @Override
    public void work() {
        System.out.println(name+" is working for 5 years");
    }
}
