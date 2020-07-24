package Replits.Replit_04112020;

public class pairnumgreater {
    public static void main(String[] args) {


        int[] numbers = {1, 9, 7, 3, 2, 13, 4, 6, 3};
        int count = 0;
        for (int i = 0; i <= numbers.length - 2; i++) {
            if (numbers[i] + numbers[i + 1] > 10) {
                count++;
            }
        }
        System.out.println(count);
    }
}