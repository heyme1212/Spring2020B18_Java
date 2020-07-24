package OfficeHours.Practice_05_13_2020;
public class staticBlock {

    static String str; //in order to initialize static variable, we need static block.
    int a=100;

    static{
        str="Cybertek";   //as soon as class is loaded, static block is executed.
        str="Harvard";
        str="MIT";
       // a=300;  you can't initialize the instance variable in the static block. you can do it with constructor.
    }

    public static void main(String[] args) {  //if we are using the static variable and main method in the same class, we can initialize
                                              //static method in main method. No need static block.
                                              //However, in the class staticBlockTest'de artik str null olur. str, static block da olmadigi icin.
        str="Cybertek";
        System.out.println(str);
    }
}

class staticBlockTest{
    public static void main(String[] args) {
        System.out.println(staticBlock.str);
    }

}
