package X_FILES;

import org.omg.CORBA.portable.IDLEntity;

public class TestData {
    private String name="Bekir";
    private int ID=987;

    public String getName(){
        return name;
    }

    public int getID(){
        return ID;
    }

    public void setName(String str){
        name=str;
    }

    public void setID(int ID){
        this.ID=ID;
    }




}
