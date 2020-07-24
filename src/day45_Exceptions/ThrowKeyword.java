package day45_Exceptions;

import java.io.IOException;
import java.util.NoSuchElementException;

public class ThrowKeyword {

    public static void main(String[] args)  {
        //Since we wont reuse it, we don't need to call it with obj.
        //NoSuchElementException obj= new NoSuchElementException();
        //throw obj;
        //we are calling obj with throw.

       // throw new NoSuchElementException();  //throw key word+ object key word manually. Anything comes after it, it will not be printable.
        //System.out.println();  //throw'dan sonra hicbirsey print edemeyiz unless we handle it.


        /*
        boolean breakTime = true;

        if(breakTime){
            throw new RuntimeException("It's break time, we should take break");
        }
        */


       //throw new IOException();

        /*
        try{
            throw new IOException();
        }catch(Exception e){

        }
        */


        int [] arr= {5,4,3,};
        // System.out.println(arr[100]);
        // System.out.println(9/0);

        //Eger 2 tane exception var ise, ustteki run olur, alttaki kalir. Sadece artihmetic exception i goruruz burada mesela.

        // throw new RuntimeException();
        //System.out.println(); //We cant print anything after throw!!

        try{
            throw new RuntimeException();
        }catch(Exception e){

        }




    }

}
