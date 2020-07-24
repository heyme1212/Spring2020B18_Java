package OfficeHours.Practice_05_13_2020;

public class Instances {
  String name;
  //asagidaki instance block u kaldirirsak Instance block class da cagirdigimiz
    // obj.name null olur. Because we didnt assign it.

    {
        name="Zuura";

    }

public static void main(String[] args) {
    Instances obj=new Instances();
    obj.name="Zuura";
}

  public void printName(){

      System.out.println("Name is: "+this.name);
  }




}
