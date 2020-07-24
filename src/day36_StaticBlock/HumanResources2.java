package day36_StaticBlock;

public class HumanResources2 {

        static Employee employee1= new Employee();
        static Employee employee2= new Employee();
        static Employee employee3= new Employee();
        static Employee employee4= new Employee();
        static Employee employee5= new Employee();


        static{
           employee1.setInfo("Ahmet",123456,"765-04-123","Junior SDET",95000,'M');
           employee2.setInfo("Ayse",123457,"765-04-124","Senior SDET",115000,'F');
           employee3.setInfo("Mehmet",123458,"765-04-125","Senior SDET",110000,'M');
           employee4.setInfo("Merve",123459,"765-04-126","Junior SDET",90000,'F');
           employee5.setInfo("Isil",123460,"765-04-127","Junior SDET",10000,'F');

       }


    }
