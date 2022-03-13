package hu.progmatic;

public class maximumkereses {
    public static void main(String[] args) {
        int[] numbers = {-104, -442, -422, -66, -333, -103, -89, -66, -501, -316, -114};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++){
            if (max < numbers[i]){
                max = numbers[i];
            }
        }

        System.out.println("Legnagyobb elem: " + max);
    }
}
