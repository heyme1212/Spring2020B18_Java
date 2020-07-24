package day54_Maps;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Intro {

    public static void main(String[] args) {
        //Map is interface and accept non primitive data type.
        //Accepts key and value as pair of data.
        Map<String, Double> employeeInfo= new LinkedHashMap<>();
        employeeInfo.put("Zarina",120000.00);

        System.out.println(employeeInfo); //{Zarina=120000.0}
        System.out.println(employeeInfo.size());  //1

        employeeInfo.put("Bakhodir",110000.50);

        System.out.println(employeeInfo); //{Zarina=120000.0, Bakhodir=110000.5}
        System.out.println(employeeInfo.size());  //2

        //System.out.println( employeeInfo.get(0)); //gives null
        //Didnt retrieve the first element.

        //I want to get the salary of Zarina, so I need to give the key value

        System.out.println(employeeInfo.get("Zarina")); //retrieve the salary
        System.out.println(employeeInfo.get("Bakhodir"));

        employeeInfo.remove("Bakhodir");
        System.out.println(employeeInfo); //remove'dan sonra size=1 oldu.Sadece Zarina kaldi.

        //Key value cant be duplicated.
        employeeInfo.put("Zarina",130000.00);

        //Because key value is same, map keeps one of them. Doesnt accept key duplicates
        //It accepts the last one if you put same key value
        System.out.println(employeeInfo.size()); // size 1, Zarina",130000.00 kaldi map de.

    }
}
