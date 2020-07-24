package day20_Arrays_Continue;

public class Arrays_Size {
    public static void main(String[] args) {
        int[] arr1={1,2,3};

      //  System.out.println(arr1[100]);  //out of bond hatasi aliriz

        int [] nums= new int[2];
        nums[0]=10;
        nums[1]=20;
       // nums[2]=30; arrays size is 2. so cant assign 3. one.
        //bu 2 variable li bir array burada nums[2] yoktur.


        //new array
        nums=new int[3]; //Reset the array. this is a new array
        //icinde 0, 0, 0 var. Burasi artik 3 variable li oldu.

        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);














    }
}
