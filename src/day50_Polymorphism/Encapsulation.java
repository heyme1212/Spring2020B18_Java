package day50_Polymorphism;

public class Encapsulation {
    private String username="MIT";

    public String getUsername() {
        return username;
    }

    //Why not static method? it doesnt accept instances. Dont make it static/
    //Get/set are instance methods.

    public void setUsername(String username) {
        this.username = username;
    }

    //data type must match with private data type.

}

class test{
    public static void main(String[] args) {
        Encapsulation obj= new Encapsulation();
        //System.out.println(obj.username); not visible outside of the class

        System.out.println(obj.getUsername());
        obj.setUsername("Cyberkek");
        System.out.println(obj.getUsername());


    }
}
