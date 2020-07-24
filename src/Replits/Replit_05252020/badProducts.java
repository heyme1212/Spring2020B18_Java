package Replits.Replit_05252020;

public class badProducts {
    public static boolean badP(int[] products,int limit){
        int count=0;
        for(int i=0; i<products.length; i++){
            if(products[i]==0){
                count++;
            }
        }

        if(count>=limit){
            return false;
        }
        return true;
    }
}
