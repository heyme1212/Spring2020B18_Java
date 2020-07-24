package OfficeHours.Practice_05_13_2020;

public class Student {
    String name;
    long id;
    static String schoolName="Cybertek";

    public String toString(){  //bu instance method u, static yapamayiz cunku we have instance variables in it. Static only accepts static.
        return "Name: "+name+", id: "+id+", School Name: "+schoolName;
    }

    public static void pSchoolName(){  //Burada sadece static variable oldugu icin hem static hem instance method ile calisir.
        System.out.println("School Name is "+schoolName);
    }
}
class StudentObjects{
    public static void main(String[] args) {
        Student student1= new Student();
        student1.name="Madina";
        student1.id=123;


        Student student2=new Student();
        student2.name="Namik";
        student2.id=456;
        student1.schoolName="Harvard";


        System.out.println(student1);
        System.out.println(student2);

    }
}

