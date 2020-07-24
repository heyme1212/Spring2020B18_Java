package OfficeHours.Practice_05_13_2020;

public class Constructor {

    public Constructor(){

        System.out.println("default constructor");
    }

    public static void main(String[] args) {

        Constructor obj= new Constructor(); //if you dont give constructor,compiler gives you a default constructor.
        System.out.println("=======================================");

        Employee employee1= new Employee("Hilal", 123, 120000);
        System.out.println(employee1.name);
        System.out.println(employee1.id);
        System.out.println(employee1.salary);


        Employee employee2= new Employee("Reem", 456, 150000);
        System.out.println(employee2); //in order to get the whole information about employee 1 or 2, we need to create toString method.
        //without toString method, it gives hascode. cant print name or id or salary as it is. Because this is custom class.

    }
}

class Employee{
    String name;
    long id;
    double salary;

    public Employee(String name, long id, double salary){
        this.name=name;
        this.id=id;  // this makes assign them to instance variable. Eger bunu yapmazsak, 0 olur sonuc.
        this.salary=salary;
    }

    public String toString(){
        return "Name: "+name+", id: "+id+", salary: "+salary;
    }
}
