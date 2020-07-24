package OfficeHours.Practice_03_18_2020;

public class logicalOperators_Practice {
    public static void main(String[] args) {
        // ||=> or &&=> and

        boolean r1 = "Muhtar" =="Bad Guy";  //==> False;
        System.out.println(r1);

        boolean r2 = "Muhtar" !="Bad Guy"; //==> True;
        System.out.println(r2);

        boolean r3 = 10>=9; //==> True;
        System.out.println(r3);

        boolean r4 = !false == !true; //==> False;
        System.out.println(r4);

        // || : as one condition is true, it is true;

        boolean result1 = 9!=8 || 9==8;  //==> True;
        System.out.println(result1);

        boolean result2 = 'a' == 'A' || 'A' =='b';  //==> False;
        System.out.println(result2);

        // && : two of the conditions are true, it is true;

        boolean result3 = 6 > 5 && 6 < 4 ;  //==> False;
        System.out.println(result3);

        boolean result4 = !false != false && !true==false ;  //==> True;
        System.out.println(result4);





    }
}
