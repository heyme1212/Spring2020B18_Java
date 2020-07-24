package day04_JavaRecap;

public class primitives_Practice {
    public static void main(String[] args){
        byte num1 = 127;
        short num2 = num1;  //double>float>long>int>short>byte
        int num4 = num2;
        long num5 = 999999999L;
        float num6 = 100L;
        System.out.println(num6);
        float num7 = 0.5f;
        System.out.println(num7);
        double num8 = 0.5f;
        double num9 = 999999999L;
        double num10 = 100.5;
        System.out.println(num10);

        char ch1 = '$';  //every character has its own corresponding number.
        System.out.println(ch1);
        char ch2 = 45000;  //0-65565 (ascii table)
        System.out.println(ch2);
        int a1 = '8';
        System.out.println(a1);

        int a2 = 'z';
        System.out.print(a2);

        char ch3 = 178;
        System.out.println(ch3);

        double d1 = 'z' + '8';
        System.out.println(d1);

        boolean bool1 = true;
        boolean bool2 = false;

        // ==: equal, !=: not equal, ! opposite

        System.out.println(9>10); //false
        System.out.println(9>=9); //true
        System.out.println(9!=10); //false
        System.out.println('a'=='b'); //false

        //System.out.println('a'=="a"); // they are not same, false

        System.out.println('a'=='b'-1);

        System.out.println("muhtar" == "good guy");
        System.out.println("muhtar" != "good guy");
        System.out.println("Muhtar" == "muhtar");  //they are different, case sensitive issue.

       // System.out.println("Cybertek" == 100000); not comparable.

        boolean r1 = !true;
        System.out.println(r1);
        System.out.println(!r1);

        System.out.println(!true== false);
        System.out.println(!true != !false);































    }

}
