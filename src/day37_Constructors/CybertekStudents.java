package day37_Constructors;

public class CybertekStudents {

    static String schoolName="Cybertek School";
    String studentName; //we must need to know
    int groupNumber;//we must need to know
    String batch;//we must need to know

    public CybertekStudents(String studentName, int groupNumber, String batch){
        //schoolName="Cybertek University";
        //since it's known an same for everyone we are not creating the school name among other instance variables.
        this.studentName=studentName;
        this.groupNumber=groupNumber;
        this.batch=batch;
    }

    public String toString(){
        return "Name: "+studentName+", Batch: "+batch+
                ", in group: "+groupNumber+", School Name: "+schoolName;
    }

}

class CObjects{
    public static void main(String[] args) {
        CybertekStudents student1= new CybertekStudents("Drar",3,"Batch18");
        student1.schoolName="MIT";
        System.out.println(student1);


        CybertekStudents student2= new CybertekStudents("Saban",12,"Batch18");
        System.out.println(student2);




    }
}
