package Replits.Replit_05102020;

import java.util.Arrays;

public class ArraysDiving {
    public static void main(String[] args) {
        int[] score = {9, 5, 5, 5,5,8, 1};
        int[] list = new int[score.length - 2];

        Arrays.sort(score);

        int sum = 0;

        for (int i = 0; i < list.length; i++) {
            sum=0;
            for (int j = 1; j < score.length - 1; j++) {
                list[i] = score[j];
                sum += list[i];
            }
        }

        double r1 = sum * 2.1 * 0.6;
        System.out.println(r1);




    }
}