package day46_Final_Abstract;

public class credentials {

    final private String username="Cybertek";
    final private String password="Cybertek1234";

    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    /*
    public void setUsername(String username){

        this.username=username;
    }
*/
    //private oldugu icin set methodlar calismaz, cunku set means reassign.
    //We cant reassign final variables.
    //We can use final keyword with get method but not with set method.


}
