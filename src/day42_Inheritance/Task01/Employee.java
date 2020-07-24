package day42_Inheritance.Task01;

public class Employee extends Person {
    /*
    create a sub class of person called Employee
				attributes: name, age, gender, Salary, employeeID, jobTitle
				methods: work, setEmployeeInfo, toString
     */
    /*
    name->Inherited from Person class
    age->Inherited from Person class
    gender->Inherited from Person class
     */
    double Salary;
    long employeeID;
    String jobTitle;

    public void work(){
        System.out.println(name+" is working");
    }

    public void setEmployeeInfo(String name, int age, char gender,double Salary, long employeeID,String jobTitle){
        setPersonInfo(name,age,gender);
        this.Salary=Salary;
        this.employeeID=employeeID;
        this.jobTitle=jobTitle;
    }

    public String toString(){
        return "Name: ,"+name+", Age: "+age+", Gender: "+gender+", Salary: "+Salary+", Empoyee ID: "+employeeID+", Job Title: "+jobTitle;
    }
}
