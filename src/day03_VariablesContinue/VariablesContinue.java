package day03_VariablesContinue;

public class VariablesContinue {

    public static void main(String[] args) {
        boolean result1 = true;
        boolean result2 = false;

        boolean result3 = 10>9; //true
        System.out.println(result3);
        System.out.println(true==false);
        System.out.println("Muhtar" == "Good Guy");
        System.out.println(true==true);

boolean r1 = true != true;
System.out.println(r1);
boolean r2 = "Batch 17"== "Batch18";
System.out.println(r2);

System.out.println("=======================================================================");
        char ch1 = 'A';
System.out.println(ch1);

char ch2 = 45000;
        System.out.println(ch2);

        char ch3 = 25000;
        System.out.println(ch3);

        char ch4 = 100;
        System.out.println(ch4);

        char ch5 = 'D';
        System.out.println(ch5);

        int num1 = 'D';
        System.out.println(num1);

        char a1 = 'z';
        //byte b1 = a1; char is larger than byte. thats why we get compile error.


        //short s1 = a1; char is larger than short.
        int i1 = a1; // int is larger than char/


    }

}
