package day36_StaticBlock;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAzerbaijan {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList=new ArrayList<>();
        employeeList.addAll(Arrays.asList(HumanResources2.employee1,HumanResources2.employee3));

        for(Employee each:employeeList){
            System.out.println(each);

        }

    }



}
