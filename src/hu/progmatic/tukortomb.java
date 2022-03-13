package hu.progmatic;

public class tukortomb {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 5, 5, 4, 3, 2, 2, 1};
        boolean isMirror = numbers.length != 0;

        for (int i = 0; i < numbers.length/2;i++){
            int lastIndex = numbers.length-1-i;
            if (numbers[i] != numbers[lastIndex]){
                isMirror = false;
                break;
            }
        }
        System.out.println("Tükörtömb? " + (isMirror ? "Igen!" : "Nem!"));
    }
}
