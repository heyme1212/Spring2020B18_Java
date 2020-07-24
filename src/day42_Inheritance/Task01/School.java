package day42_Inheritance.Task01;

import java.util.ArrayList;
import java.util.Arrays;

public class School {
    /*
    create a class called school:
					create 3 objects of student and set their info
					create a an ArrayList of students to store all student objects
					use for each loop to print out each students' name and studentID
     */

    //String name, int age, char gender,long studentID,String clazz){
    public static void main(String[] args) {
        Student student1=new Student();
        student1.setStudentInfo("Ahmet",16,'M',123,"10-D");

        Student student2=new Student();
        student2.setStudentInfo("Ayse",13,'F',125,"7-A");

        Student student3=new Student();
        student3.setStudentInfo("Asli",14,'F',128,"8-C");

        ArrayList<Student> studentsList= new ArrayList<>();
        studentsList.addAll(Arrays.asList(student1,student2,student3));


        for(int i=0; i<studentsList.size(); i++){
            System.out.println(studentsList.get(i).name+" "+studentsList.get(i).studentID );
        }

        for(Student each: studentsList){
            System.out.println(each);
        }
    }
}
