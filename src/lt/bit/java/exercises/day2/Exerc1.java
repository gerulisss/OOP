package lt.bit.java.exercises.day2;

import java.util.Arrays;

public class Exerc1 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3};

        System.out.println(Arrays.toString(intArr));

        for (int i = 0; i < intArr.length; i++) {
            intArr[i]  +=2;
        }
        System.out.println(Arrays.toString(intArr));
    }
}

