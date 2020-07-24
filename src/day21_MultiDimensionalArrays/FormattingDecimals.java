package day21_MultiDimensionalArrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.text.DecimalFormat;

public class FormattingDecimals {
    public static void main(String[] args) {
        DecimalFormat DF= new DecimalFormat("0.00");

        double a=10.0/3.0;
        System.out.println(a);

        System.out.println(DF.format(a) ); //by default it rounds 3.decimals.

        System.out.println(2.346789);
        System.out.println(DF.format(2.346789)); //2.35




    }
}
