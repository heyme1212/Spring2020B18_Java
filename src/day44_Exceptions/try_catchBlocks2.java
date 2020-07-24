package day44_Exceptions;


public class try_catchBlocks2 {
    public static void main(String[] args) {
        System.out.println("Hello");

        try{
            Thread.sleep(3000);  //interrupted exception
            System.out.println("Try block");

        }catch(Exception e){    //interrupted exception'da yazabilirdik buraya exception hepsini cover ediyor.//buraya runtime error yazamayiz.
            System.out.println("Catch block");
        }


        System.out.println("World");




    }





}
