package day42_Inheritance.Task01;

import java.util.ArrayList;
import java.util.Arrays;

public class Company {
    /*
    create a class called company:
					create 3 objects of employee and set thier info
					create an array of employees and store all those employee objects
					use regular for loop to print out each employee' name and employeeID
     */
    public static void main(String[] args) {
        Employee employee1=new Employee();
        employee1.setEmployeeInfo("Ali",30,'M',120000,123456,"Developer");

        Employee employee2=new Employee();
        employee2.setEmployeeInfo("Kerim",25,'M',90000,123457,"QA");

        Employee employee3=new Employee();
        employee3.setEmployeeInfo("Fatma",29,'F',110000,123459,"Senior Tester");

        ArrayList<Employee> employeeList= new ArrayList<>();
        employeeList.addAll(Arrays.asList(employee1,employee2,employee3));

        for(int i=0; i<employeeList.size(); i++){
            System.out.println(employeeList.get(i).name+" "+employeeList.get(i).employeeID);
        }
    }

    }
