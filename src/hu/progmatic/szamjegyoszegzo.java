package hu.progmatic;

public class szamjegyoszegzo {
    public static void main(String[] args) {
        doit(1);
        doit(2);
        doit(-1);
        doit(12);
        doit(-5483229);
    }

    public static int sumDigits(int number){
        int sumDigits = 0;

        do {
            sumDigits += number % 10;
            number = number/10;
        }while(number != 0);

        return  abs(sumDigits);
    }

    public static int abs(int number){
        return number < 0 ? -number : number;
    }

    public static void doit(int number){
        System.out.println(number + " számjegyeinek összege: " + sumDigits(number));
    }
}
