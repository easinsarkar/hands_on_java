public class Main {
    public static void main(String[] args) {
        System.out.println( hasSharedDigit( 12, 23) );
        System.out.println( hasSharedDigit( 99, 9) );
        System.out.println( hasSharedDigit( 15,55) );
    }
    public static boolean hasSharedDigit(int number1, int number2) {
        int digit11 = number1 / 10;
        int digit12 = number1 % 10;
        int digit21 = number2 / 10;
        int digit22 = number2 % 10;
        return ( number1 >= 10 && number1 <= 99 ) &&
                ( number2 >= 10 && number2 <= 99 ) &&
                ( digit11 == digit21 || digit11 == digit22 || digit12 == digit21 || digit12 == digit22 );
    }
}
