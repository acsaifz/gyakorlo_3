package hu.progmatic;

public class hatvanyozas {
    public static void main(String[] args) {
        doit(0,0);
        doit(2,0);
        doit(2,1);
        doit(2,3);
        doit(5,3);
        doit(7,5);
    }

    public static int power(int base, int exponent){
        int result = 1;

        for (int i = 1; i <= exponent; i++){
            result *= base;
        }

        return result;
    }

    public static void doit(int base, int exponent){
        System.out.println(base + "^" + exponent + "=" + power(base,exponent));
    }
}
