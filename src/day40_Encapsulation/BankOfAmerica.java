package day40_Encapsulation;

public class BankOfAmerica {
    public static void main(String[] args) {
        EmployeeInfo Abdul= new EmployeeInfo();

        Abdul.setAddress("Virginia");
        Abdul.setSalary(120000.05);

        System.out.println(Abdul.getAddress());  //setAdress yapmadan once null cikti
        System.out.println(Abdul.companyName);
        System.out.println(Abdul.getSalary());




    }
}
