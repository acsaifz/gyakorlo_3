package hu.progmatic;

public class minimumkereses {
    public static void main(String[] args) {
        int[] numbers = {-104, -442, -422, -66, -333, -103, -89, -66, -501, -316, -114};
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++){
            if (min > numbers[i]){
                min = numbers[i];
            }
        }

        System.out.println("Legkisebb elem: " + min);
    }
}
