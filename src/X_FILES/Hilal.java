package X_FILES;

import Replits.Replit_04132020.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Hilal {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
        ArrayList<String> targetWord = new ArrayList<String>();
        targetWord.add("hi");

        wordList.removeAll(targetWord);

        System.out.println(wordList);


}


}
