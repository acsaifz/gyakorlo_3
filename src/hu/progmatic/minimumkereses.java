package hu.progmatic;

public class minimumkereses {
    public static void main(String[] args) {
        int[] numbers = {1};
        doit(numbers);
        numbers = new int[]{1, 2};
        doit(numbers);
        numbers = new int[]{1, -2};
        doit(numbers);
        numbers = new int[] {-2, 1, -6, 10};
        doit(numbers);
        numbers = new int[]{-104, -442, -422, -66, -333, -103, -89, -66, -501, -316, -114};
        doit(numbers);
    }

    public static int min(int[] numbers){
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++){
            if (min > numbers[i]){
                min = numbers[i];
            }
        }

        return min;
    }

    public static String intsToString(int[] numbers){
        String string = "(";
        for(int i = 0; i < numbers.length - 1; i++){
            string += numbers[i] + ", ";
        }
        if (numbers.length > 0) string += numbers[numbers.length-1];
        string += ")";

        return string;
    }

    public static void doit(int[] numbers){
        System.out.println("Min" + intsToString(numbers) + " = " + min(numbers));
    }
}
