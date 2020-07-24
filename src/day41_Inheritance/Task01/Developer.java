package day41_Inheritance.Task01;

public class Developer extends Employee {
    /*
    create subclass of employee name it developer:
    variables: salary, name, id, jobTitle, gender
    action: fixingBug, coding
     */

    /*
    name(inherited)
    salary (inherited)
    id(inherited)
    jobtitle(inherited)
    gender(inherited)
    fixingBug()
    coding()
    toString() (inherited)
     */

    public Developer(double salary, String name, long id, String jobTitle, char gender){
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void fixingBug(){
        System.out.println(name+" is fixing the bug");
    }

    public void coding(){
        System.out.println(name+" is coding");
    }

}