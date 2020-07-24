package day03_VariablesContinue;
    /*
    rate = 55;
    statetaxrate= 0.04;
    federaltaxrate= 0.22;
    weeklyhours= 40;

    then output will be:
    your salary is: 105600 USD
    your total tax is: 27456 USD
    your income after tax is: 78144 USD

     */
    public class SalaryCalculator {
    public static void main(String[] args) {
        double hourlyrate = 65;
        double statetaxrate = 0.04;
        double federaltaxrate = 0.22;
        byte weeklyhours = 45;
        byte totalweeks = 48;
        double salary = hourlyrate * weeklyhours * totalweeks;
        double statetax = salary * statetaxrate;
        double federaltax = salary * federaltaxrate;
        double salaryaftertax = salary - statetax - federaltax;

        System.out.println("Your Salary is: $" + salary );
        System.out.println("Your Total Tax is: $" + (statetax+federaltax));
        System.out.println("Federal Tax is:" + federaltax + "USD");
        System.out.println("Your State Tax is:" + statetax + "USD");
        System.out.println("Your Income After Tax is:" + salaryaftertax + "USD");






    }
}
