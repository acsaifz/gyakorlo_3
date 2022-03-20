package hu.progmatic;

public class tukortomb {
    public static void main(String[] args) {
        int[] numbers = new int[0];
        doit(numbers);
        numbers = new int[7];
        doit(numbers);
        numbers = new int[]{1};
        doit(numbers);
        numbers = new int[]{1, 1};
        doit(numbers);
        numbers = new int[]{1, 1, 2};
        doit(numbers);
        numbers = new int[]{1, 2, 1};
        doit(numbers);
        numbers = new int[]{1, 2, -1};
        doit(numbers);
        numbers = new int[]{1, 2, 2, 3, 5, 5, 4, 3, 2, 2, 1};
        doit(numbers);
        numbers = new int[]{1, 2, 2, 3, 4, 5, 5, 4, 3, 2, 2, 1};
        doit(numbers);
    }

    public static boolean isMirror(int[] numbers){
        boolean isMirror = numbers.length != 0;

        for (int i = 0; i < numbers.length/2;i++){
            int lastIndex = numbers.length-1-i;
            if (numbers[i] != numbers[lastIndex]){
                isMirror = false;
                break;
            }
        }
        return isMirror;
    }

    public static String intsToString(int[] numbers){
        String string = "[";
        for(int i = 0; i < numbers.length - 1; i++){
            string += numbers[i] + ", ";
        }
        if (numbers.length > 0) string += numbers[numbers.length-1];
        string += "]";

        return string;
    }

    public static void doit(int[] numbers){
        System.out.println(intsToString(numbers)  + " tükörtömb? " + (isMirror(numbers) ? "Igen!" : "Nem!"));
    }
}
