package day42_Inheritance.Task01;

public class Student extends Person {
    /*
    create a subclass of Person called Student
				attributes: name, age, gender, studentID, class
				methods: attendClass, code, setStudentInfo, toString
     */
    /*
    name->Inherited from Person class
    age->Inherited from Person class
    gender->Inherited from Person class
     */
    long studentID;
    String clazz;
    public static String school="Cybertek";

    public void attendClass(){
        System.out.println(name+" is atteding the class");
    }

    public void coding(){
        System.out.println(name+" is coding in the class");
    }

    public void setStudentInfo(String name, int age, char gender,long studentID,String clazz){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.studentID=studentID;
        this.clazz=clazz;
    }

    public String toString(){
        return "Name: "+name+", Age: "+age+", Gender: "+gender+", Student ID: "+studentID+", Class: "+clazz+", School is: "+school;
    }
}
