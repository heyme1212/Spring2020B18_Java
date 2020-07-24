package X_FILES;

import Replits.Replit_04132020.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class hi2 {
       /*
  at3("longword","foo")
will return: "lonfoogword"

at3("blabla","a")
will return: "blaabla"

        */

    public static String at3(String target,String word)
    {

        String str=target.substring(0,3).concat(word).concat(target.substring(3));
        return str;


    }

}
