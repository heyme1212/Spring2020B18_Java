package day25_MethodsRecap;
import Resources.Library;
public class Test {
    public static void main(String[] args) {
        String str="ABCABCABCAABACC";
        String result=Library.RemoveDuplicates(str);
        System.out.println(result);

        String str1="AABBCDEB";
        String str2="B";
        int num1=Library.Frequency(str1,str2);




    }
}
