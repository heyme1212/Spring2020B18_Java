package day38_Constructors;

public class SalaryCalculator {
    double hourlyrate;
    int weeklyhour;
    double stateTaxRate;
    double federalTaxRate;

    public SalaryCalculator(double hourlyrate,int weeklyhour, double stateTaxRate, double federalTaxRate){
        this.hourlyrate=hourlyrate;
        this.weeklyhour=weeklyhour;
        this.stateTaxRate=stateTaxRate;
        this.federalTaxRate=federalTaxRate;
    }

    public double salary(){
        return hourlyrate * weeklyhour * 48;
    }

    public double stateTax(){
        return salary()*stateTaxRate;
    }
    public double federalTax(){
        return salary()*federalTaxRate;
    }

    public double salaryAfterTax(){
        return salary()-stateTax()-federalTax();
    }

    public String toString(){
        return "The hourly rate is: $" +hourlyrate+" Weekly Hour is: "+weeklyhour+" Salary is: $"+salary();
    }
}
class SalaryObjects{
    public static void main(String[] args) {
        SalaryCalculator Zareen=new SalaryCalculator(65,45,0.06,0.20);
        System.out.println(Zareen);
    }
}


