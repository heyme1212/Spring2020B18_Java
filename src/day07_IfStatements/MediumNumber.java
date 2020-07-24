package day07_IfStatements;

public class MediumNumber {
    /*

    4. write a java program that accepts three numbers and return the median number
				(assume that none of them are equal)
     */
    public static void main(String[] args) {
        double a= 100;
        double b= 1000;
        double c=500;

        boolean aMed = a<b && a>c || a>b && a<c;
        boolean bMed = b<a && b>c || b>a && b<c;
        boolean cMed = c<a && c>b || c>a && c<b;

        if(aMed){
            System.out.println(a + " is the medium number");
        }

        if(bMed){
            System.out.println(b + " is the medium number");
        }

        if(cMed){
            System.out.println(c + " is the medium number");
        }

    }

}







