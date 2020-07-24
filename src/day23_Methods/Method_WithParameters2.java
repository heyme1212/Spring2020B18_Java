package day23_Methods;

public class Method_WithParameters2 {
    //create a function that can reverse any string

    //muhtar _> rathm
    public static void main(String[] args) {
        String names="Hilal";
        ReverseString(names);

        String names2="Cybertek School";
        ReverseString(names2);

    }

    public static void ReverseString(String str){
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }











}

