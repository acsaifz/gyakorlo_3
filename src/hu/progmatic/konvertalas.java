package hu.progmatic;

import java.util.Arrays;

public class konvertalas {
    public static void main(String[] args) {
        int[] numbers = {-2, 1, -6, 10};

        String[] strings = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            strings[i]=String.valueOf(numbers[i]);
        }
        System.out.println(Arrays.toString(strings));
    }
}
