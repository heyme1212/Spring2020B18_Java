package Day26_MethodsOverloading;

public class WarmUp {
    /*
    1. write a return method called frequency that accepts two parameters: string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2
			Note: MUST use Arrays and for each loop
	2. use the above method to create another called uniques that accepts a string paramter and returns it's unique characters as String
			Ex: uniques("ABBC"); 		==> "AC"
				uniques("Cybertek");  	==> "cybrtk"


     */

    public static void main(String[] args) {

        System.out.println(Frequency("ABAB",'A'));
        System.out.println(Unique("Cybertek"));



    }

    public static int Frequency(String str, char ch){
        String name="AAA";
        char ch1='A';
        int count=0;
        String result="";

        for(int i=0; i<name.length(); i++){
            if(name.charAt(i)==ch1){
                count++;
            }
        }
        return count;

    }

    public static String Unique(String str){
        String str1="Cybertek";
        String result="";

        for(int i=0; i<str.length();i++){
            if(!(result.contains(""+str1.charAt(i)))){
                result+=""+str.charAt(i);
            }
        }

        return result;




    }












}
