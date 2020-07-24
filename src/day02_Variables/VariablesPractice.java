package day02_Variables;

public class VariablesPractice {
        public static void main(String[] args){
        //salary, federal tax rate, state tax tate, loan, ssn

            int salary = 120000;
            double federalTax = 0.18;
            float stateTax = 0.065f;
            //salaryaftertax= salary(1-sum of taxes)



            double sumTaxes = federalTax + stateTax;
            double salaryaftertax = salary * (1-sumTaxes);
            System.out.println(salaryaftertax);

            //are of the circle = r*r*pi

            double pi = 3.14;
            double r = 5.5;
            double area = r *r*pi;
            System.out.println(area);



            int kg = 60;
            double pound = kg* 2.25;
            System.out.println(pound);


            int lira = 1000;
            double lirainDollar = lira/6.15;
            System.out.println(lirainDollar);


            double rupi = 1000;
            double rupiinDollar= rupi* 0.014;
            System.out.println(rupiinDollar);



            double liter = 100;
            double literinGalons = liter/3.7;
            System.out.println(literinGalons);




    }


}
