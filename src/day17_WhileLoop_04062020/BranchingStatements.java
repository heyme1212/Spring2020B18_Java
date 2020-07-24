package day17_WhileLoop_04062020;

public class BranchingStatements {
    public static void main(String[] args) {

        //System.exit();
        // it stops the entire system.you can use it anywhere.

        for(int i=0; i<5; i++){
            if(i%2!=0){
                System.exit(0);    //stops everything immediately nothing printed after system.exit.
                //onun yerine break ya da continue olsaydi test completed hala print edilecekti ama System.exit de hersey duruyor artik

            }
            System.out.println(i);
        }

        System.out.println("test completed");

        System.out.println("+++++++++++++++++++++++++++");

        if(10<9){
            System.exit(0);
        }

        System.out.println("Test complated");
        System.out.println("Hello World");














    }



}
