package OfficeHours.Practice_04_22_2020;

public class returnStatement {
    public static void main(String[] args) {
        Method1();
        System.out.println("Hello B18");
    }

//Bu durumda main metthod daki print calisir ama returnden sonraki Mehod1 calismaz
//Sadece Method1 daki return sonrasi calismaz.
//Return exists the current method.
// break: exists the loop or switch statement, otherwise compile error verir
// continue statement must be in the loop, skips the current iteration.
// System.exit(0) exits the entire system.
public static void Method1(){
        if(10>9){
            return;
        }

    System.out.println("HelloHello");
    }

}
