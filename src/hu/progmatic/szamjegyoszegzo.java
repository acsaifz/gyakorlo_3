package hu.progmatic;

public class szamjegyoszegzo {
    public static void main(String[] args) {
        int number = 123456;
        int sumDigits = 0;

        do {
            sumDigits += Math.abs(number) % 10;
            number = number/10;
        }while(number != 0);

        System.out.println("Számjegyek összege: " + sumDigits);
    }
}
