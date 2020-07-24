package Day49_Practices;
     /*
    Task01:
	1. create an interface named onlineEducation
			variable: boolean onlineStudent
			abstract methods: attendClass();

	2. create an interface named Cybertek that can inherit from online education
			variable: schoolName, requiresITBackGround

	3. create an class named Student that can inherit from  onlineEducation and CybertekSchool
			private variables: studentName, age, grade, has_ITBackGround

			encapsulate all private variables

			actions: studying(), takingBreaks(), toString()

	4. create a class named CybertekSchool
			create 5 objects of students and set your classmates' info
			create a list of Cybertek and store all student objects

			iterate the list to display the full information of students
     */

import java.util.ArrayList;
import java.util.Arrays;

interface OnlineEducation {
    boolean onlineStudent=true;
    void attendClass();
}

interface Cybertek extends OnlineEducation{
    String schoolName="Cybertek";
    boolean requiresITBackGround=false;
}

class Student implements OnlineEducation, Cybertek{
    private String studentName;
    private int age;
    private int grade;
    private boolean has_ITBackGround;

    public Student(String studentName, int age, int grade, boolean has_ITBackGround) {
        setStudentName(studentName);
        setAge(age);
        setGrade(grade);
        setHas_ITBackGround(has_ITBackGround);
    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isHas_ITBackGround() {
        return has_ITBackGround;
    }

    public void setHas_ITBackGround(boolean has_ITBackGround) {
        this.has_ITBackGround = has_ITBackGround;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void studying(){
        System.out.println(studentName+" is studying");
    }

    public void takingBreaks(){
        System.out.println(studentName+" takes break for 10 minutes");
    }

    @Override
    public void attendClass() {
        System.out.println(studentName+" attends the class everyday");
    }

    public String toString(){
        return "Name of the student is: "+getStudentName()+" studying at "+schoolName+", age is: "+getAge()+", grade is: "+getGrade()+" "+isHas_ITBackGround();
    }
}

class CybertekSchool{
    public static void main(String[] args) {

        Student student1= new Student("Ayse",25,90,true);
        Student student2= new Student("Ali",30,95,true);
        Student student3= new Student("Kerem",29,85,false);
        Student student4= new Student("Asli",22,80,false);
        Student student5= new Student("Busra",18,70,false);

        ArrayList<Student> Cybertek= new ArrayList<>();
        Cybertek.addAll(Arrays.asList(student1,student2,student3,student4,student5));

        for(Student each: Cybertek){
            System.out.println(each);
        }
    }
}
