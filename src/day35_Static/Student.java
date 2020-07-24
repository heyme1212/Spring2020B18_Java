package day35_Static;

public class Student {
    String name;
    int id;
    double gpa;
    static String school="Cybertek";

    //this keyword refers to object instance, it is used for instance variables
    //if we are using instance variables, we cant use static method

    public void setInfo(String name,int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

        public static void printSchoolName(){
            System.out.println("School name is "+school);
        }

        public String toString(){
            return "Name: "+name+", School Name: "+school;
        }



}
