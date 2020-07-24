package day40_Encapsulation;

public class Encapsulation {
    //encapsulation means data hiding with private access modifier.
    // Making instance variable private.
    //use the private data through getter and setter.
    //one is reading the data other getting the data with public access modifier.
    //any direct access is restricted with private.
    //getter is for reading the private data.

    private long SSN;
    public long getSSN(){
        return SSN;
    }

    //setter write the data,initialize the data
    //that's why return type is void.
    //yes it has a parameter

    public void setSSN(long SSN){
        this.SSN=SSN;

    }







}
