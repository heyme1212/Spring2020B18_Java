package Replits.Replit_04192020;

public class Method166 {
    public static void main(String[] args) {
        String one="hilalcatpinar";
        String two="hilal";
        int length1=one.length();
        int length2=two.length();
        String result="";



        if(length2>length1){
            for(int i=0; i<length1; i++){
                result+=""+one.charAt(i)+two.charAt(i);
            }
            result+=two.substring(length1);
        }else{
            for(int i=0; i<length2; i++){
                result+=""+one.charAt(i)+two.charAt(i);
            }
            result+=one.substring(length2);

        }

        System.out.println(result);


    }
}
