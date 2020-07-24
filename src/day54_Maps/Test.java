package day54_Maps;

import day46_Final_Abstract.Browser;

public class Test {
    public static void main(String[] args) {
        Color myfavoriteColor1= Color.Blue;

        //Enum means costum data type
        //Color enumdaki renkler disinda baska birsey assign edemem.
        //Custom data type da fix set verririz. Every time you created enum, it means fixed set of constants.

        Color myfavoriteColor2= Color.Green;
        Color myfavoriteColor3= Color.Red;
       // Color myfavoriteColor4= Color.White;

        System.out.println(myfavoriteColor1);

        Browsers browserName= Browsers.Chrome;

        //if I make it String, the option is endless.
        //However if I make the data type browsers, I Have only limited kind of browsers.
        String Bn="Chrome";
        


    }
}
