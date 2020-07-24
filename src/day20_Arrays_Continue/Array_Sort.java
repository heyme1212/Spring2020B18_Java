package day20_Arrays_Continue;
import java.util.Arrays;
public class Array_Sort {
    public static void main(String[] args) {

        //Ascending order
        int[] arr1={9,8,7,6,5,4,3,2,1};
        Arrays.sort(arr1);  //[1, 2, 3, 4, 5, 6, 7, 8, 9]

        System.out.println(Arrays.toString(arr1));

        System.out.println("First min number is "+arr1[0]);
        System.out.println("Second min number is "+arr1[1]);
        System.out.println("First Max number is "+arr1[arr1.length-1]);
        System.out.println("Second Max number is "+arr1[arr1.length-2]);


        char[] ch={'Z', 'D','W','Y','A','B','E','D'};
        Arrays.sort(ch); //[A, B, D, D, E, W, Y, Z]

        System.out.println(Arrays.toString(ch));

        String[] names={"Deniz", "Osman", "Rustem", "Ali", "Anna", "Adil"};
        Arrays.sort(names); //[Adil, Ali, Anna, Deniz, Osman, Rustem]


        System.out.println(Arrays.toString(names));


        String[] names1={"Deniz","Osman","Rustem", "Ali", "ANna", "Adil"};
        Arrays.sort(names1); //[ANna, Adil, Ali, Deniz, Osman, Rustem]

        System.out.println(Arrays.toString(names1));

        System.out.println("++++++++++++++++++++++++++++");

        //Descending order:

        int[] arr={3,1,4,-1,100,-100,200,155};
        Arrays.sort(arr); //[-100, -1, 1, 3, 4, 100, 155, 200]
        System.out.println(Arrays.toString(arr));

        int[]arrDes= new int[arr.length];

        int j=0;

        for(int i=arr.length-1; i>=0; i--){
            //System.out.print(arr[i]+" ");    //200 155 100 4 3 1 -1 -100
             arrDes[j]=arr[i];
             j++;
        }

        System.out.println(Arrays.toString(arrDes));












    }
}
