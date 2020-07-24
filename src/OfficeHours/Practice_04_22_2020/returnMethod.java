package OfficeHours.Practice_04_22_2020;

public class returnMethod {
    public static void main(String[] args) {
        //sum(10,20);
        int num1=sum2(500,600);
        System.out.println(num1);

        String name="level";
        String revname=reverse(name);
        System.out.println(revname);
        System.out.println(name.equals(revname));

    }


    public static void sum(int a,int b){
        System.out.println(a+b);
    }

    public static int sum2(int a,int b){
        return a+b;
    }

    public static String reverse(String str){
        //reversed of a string
        String result="";
        for(int i=str.length()-1; i>=0; i--){
            result+=str.charAt(i);
        }
        return result;
    }

}
