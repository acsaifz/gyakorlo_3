package hu.progmatic;

public class hatvanyozas {
    public static void main(String[] args) {
        int base = 7;
        int exponent = 5;
        int result = 1;

        for (int i = 1; i <= exponent; i++){
            result *= base;
        }

        System.out.println(result);
    }
}
