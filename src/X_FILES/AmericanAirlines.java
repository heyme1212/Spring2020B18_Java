package X_FILES;

import day36_StaticBlock.Employee;

public class AmericanAirlines {
    public static void main(String[] args) {
        EmployeeInfo em1= new EmployeeInfo();
       // em1.name="emrah";  now this is private data and I cant access it here.

        em1.setName("Emrah");
      // System.out.println(em1.name);//hala cagiramadim
        System.out.println(em1.getName());

        em1.setSSN(124);
        System.out.println(em1.getSSN());

        EmployeeInfo em2= new EmployeeInfo();
        EmployeeInfo em3= new EmployeeInfo();





    }
}

/*

         digit1=(num/10000);
         digit2=((num%10000)/1000);
         digit3=((num%1000)/100);
         digit4=((num%100)/10);
         digit5=num%10;

 */