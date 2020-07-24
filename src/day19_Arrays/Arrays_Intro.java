package day19_Arrays;

public class Arrays_Intro {
    public static void main(String[] args) {
        /*
        Data Structure:
        1.Array
        2.Collection
        3.Maps

        Array is a variable that can hold multiple variables

        Declaration:
        DataType[]  variable name = {data1, data2, data3};

         */

        int[] scores={70, 75, 85, 90, 95, 100};   //
        int scores2 []={70, 75, 85, 90, 95, 100}; // you can use brackets after data type or name.
                     //  0   1   2   3   4   5
        //each data has its own index number

        /*
        to retrieve data from array: variable name[index num]

         */

        int num1= scores[2];//returns me an int
        System.out.println(num1);  //85

        int num2=scores[5];
        System.out.println(num2);  //100








    }
}
