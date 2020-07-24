package day25_MethodsRecap;

public class WarmUp1 {
    /*
    warmup task:
	1.  write a return method that accepts a String and removes duplicate values from the String
		Ex:
				RemoveDuplicate("aaabbbccc");  ==> "abc"
	2. write a return method that accepts two strings str1 & str2, and returns the frequency of str2 in str1 as an int
		Ex:
			Frequency("AAABB", "A");  ==> 3
			Frequency("ABAB", "B"); ==> 2
	3. (This one I will do it too tomorrow in class) Combine above two methods to write a return method that can return the frequencyt of characters as a stringfrom any given string
		Ex:
			FrequencyOfChars("ABABCB"); ==> "A2B3C1";
			FrequencyOfChars("AAABCCCDD") ==> "A3B1C3D2"
     */

    public static void main(String[] args) {
        System.out.println(RemoveDuplicate("aaabbbccc"));
        System.out.println(Frequency("AAABB", "A"));
        System.out.println(FrequencyOfChars("AAABCCCDD"));


    }

    /*
    1.  write a return method that accepts a String and removes duplicate values from the String
		Ex:
				RemoveDuplicate("aaabbbccc");  ==> "abc"
     */

    public static String RemoveDuplicate(String str){
        String result="";
        for(int i=0; i<str.length(); i++){
            if(!(result.contains(""+str.charAt(i)))){
                result+=""+str.charAt(i);
            }
        }
        return result;
    }

    /*
    2. write a return method that accepts two strings str1 & str2, and returns the frequency of str2 in str1 as an int
		Ex:
			Frequency("AAABB", "A");  ==> 3
			Frequency("ABAB", "B"); ==> 2
     */

    public static int Frequency(String str1, String str2){
        int count=0;
        for(int i=0; i<str1.length(); i++){
            if((""+str1.charAt(i)).equals(str2)){
                count++;
            }
        }
    return count;
    }

    /*
    3. (This one I will do it too tomorrow in class) Combine above two methods to write a return method that can return the frequency of characters
    as a string from any given string
		Ex:
			FrequencyOfChars("ABABCB"); ==> "A2B3C1";
			FrequencyOfChars("AAABCCCDD") ==> "A3B1C3D2"
     */

    public static String FrequencyOfChars(String str){
        String strUnique= RemoveDuplicate(str);
        String result="";
        for(int i=0; i<strUnique.length(); i++){
            int freq=Frequency(str,(""+strUnique.charAt(i)));
            result+=(""+strUnique.charAt(i))+freq;
        }
        return result;
    }







}
