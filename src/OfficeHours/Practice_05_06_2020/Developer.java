package OfficeHours.Practice_05_06_2020;

public class Developer {
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

    public String toString(){
        return "Name: "+name+", job title: "+jobTitle
                +", salary: $"+salary+" ID: "+emloyeeId;
    }

    public void coding(){
        System.out.println(name+" is coding");
    }

    public void fixingbug(){
        System.out.println(name+" is fixing the bug");
    }











}
