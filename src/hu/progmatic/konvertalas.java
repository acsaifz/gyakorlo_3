package hu.progmatic;

import java.util.Arrays;

public class konvertalas {
    public static void main(String[] args) {
        int[] numbers = new int[0];
        doit(numbers);
        numbers = new int[]{1};
        doit(numbers);
        numbers = new int[]{1, 2, 3};
        doit(numbers);
        numbers = new int[]{-2, 1, -6, 10};
        doit(numbers);
    }

    public static String[] intsToStrings(int[] numbers){
        String[] strings = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            strings[i]=String.valueOf(numbers[i]);
        }

        return strings;
    }

    public static String stringsToString(String[] strings){
        String string = strings.length == 0 ? "[" : "[\"";
        for(int i = 0; i < strings.length - 1; i++){
            string += strings[i] + "\", \"";
        }
        if (strings.length > 0) string += strings[strings.length-1];
        string += strings.length == 0 ? "]" : "\"]";

        return string;
    }

    public static void doit(int[] numbers){
        System.out.println(stringsToString(intsToStrings(numbers)));
    }
}
