package lesson1;


import java.util.Arrays;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

        String highAndLow = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
        int[] array = Arrays.stream(highAndLow.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        String result = array[array.length-1]+" "+array[0];
        System.out.println(result);
    }
}
