package day12_JavaRecap_Scanner;
import java.util.Scanner;
public class StudentGrade_Scanner {

    /*
     3. Write a Java Program that can calculate the grade of a student based on the score,
        implement the following logic:
                If marks < 60, then print “Fail”
                If marks >= 60, but less than 90, then print “Pass”
                If marks >= 90, then print “Passed with Distinction”
                MUST use scanner
     */

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter your grade:");
        int grade= input.nextInt();

        if(grade>=0 && grade<=100){
            if (grade>=90){
                System.out.println("Passed with distinction");
            }else if(grade>=60 && grade<90){
                System.out.println("Pass");
            }else{
                System.out.println("Fail");
            }
} else{
            System.out.println("Invalid Grade");
}






        }

}
