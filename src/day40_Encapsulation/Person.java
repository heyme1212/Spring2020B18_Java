package day40_Encapsulation;

public class Person {
    public String name;
    private long SSN;
    private int ID;

    public Person(String name){
        this.name=name;
    }

    //In order to generate getter and setter you need to use instance variable
    //which we are used in the same class.
    //Getter/setter should be created in this class only.


    public long getSSN() {
        return SSN;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
