package day37_Constructors;

public class StudentsObject {
    public static void main(String[] args) {
        /*
        Student student1= new Student();
        student1.setInfo("Marina",34,'F',"Cybertek");
        System.out.println(student1);
        */

        //we created constructor with parameters.
        //we need to call the setinfo manually that's why we created constructor.

        Student student1=new Student("Marina",34,'F',"Cybertek");
        Student student2=new Student("Sha",35, 'M',"Harward");

        System.out.println(student1);
        System.out.println(student2);






    }

}
