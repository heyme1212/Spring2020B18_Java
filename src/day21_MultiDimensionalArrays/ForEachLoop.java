package day21_MultiDimensionalArrays;

public class ForEachLoop {
    public static void main(String[] args) {
        /*
         iterates the array
         for(data type variablename: Array Name){
                                   }

           number of execution is depends on the length of array.
           Whenever you dont need to provide the index number, it method is used.

         */

        int[] nums={1,2,3,4};

        for(int eachElement : nums){
            System.out.print(eachElement+" ");
        }

        String [] students={"Muhtar", "Asiya","Murodil"};
        for(String eachName:students){
            System.out.print(eachName+" ");
        }

        System.out.println();

        // take out numbers greater than 5;
        int[] arr1={1,2,3,4,5,6,7,8,9,10};

        for(int each: arr1){
            if(each<5){
                continue;
            }
            System.out.println(each);
        }

        System.out.println("====================");
        String sentence="I like Java"; //reverse it with for each loop

        String [] words=sentence.split(" ");

        for(int i = words.length-1; i >= 0; i--) {
            System.out.print(words[i]+" ");
        }























    }

}
