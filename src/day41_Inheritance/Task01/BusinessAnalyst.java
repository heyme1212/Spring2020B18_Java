package day41_Inheritance.Task01;

public class BusinessAnalyst extends Employee {
    /*
     create subclass of employee name it business analyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequiremnts, gathering

     name (Inherited)
     salary(Inherited)
     id(Inherited)
     jobtitle(Inherited)
     gender(Inherited)

    writingReq()
    gathering()
    toString() (Inherited)
     */

    public BusinessAnalyst(String name,double salary, long id,char gender){
        this.name=name;
        this.salary=salary;
        this.id=id;
        jobTitle="Business Analyst";
        this.gender=gender;
    }

    public void writingReq(){
        System.out.println(name+" is wiring requirements");
    }

    public void gathering(){
        System.out.println(name+" is gathering requriments");
    }


}
