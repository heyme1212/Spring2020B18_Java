package day46_Final_Abstract;

import java.io.IOException;

public class Quiz {

    public static void main(String[] args) throws IOException {
        method();
        System.out.println("Test Completed");
    }

    public static void method() throws IOException{
        throw new IOException();
    }
}
