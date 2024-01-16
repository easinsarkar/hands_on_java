public class Main {
    public static void main(String[] args) {
        System.out.println( hasSameLastDigit (41, 22, 71) );
        System.out.println( hasSameLastDigit (23, 32, 42) );
        System.out.println( hasSameLastDigit (9, 99, 999) );
        System.out.println( isValid(10) );
        System.out.println( isValid(468) );
        System.out.println( isValid(1051) );
    }
    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        int lastDigit1 = number1 % 10;
        int lastDigit2 = number2 % 10;
        int lastDigit3 = number3 % 10;
        return ( ( number1 >= 10 && number1 <=1000 ) &&
                ( number2 >= 10 && number2 <=1000 ) &&
                ( number3 >= 10 && number3 <=1000 ) ) &&
                ( lastDigit1 == lastDigit2 ||
                        lastDigit1 == lastDigit3 ||
                        lastDigit2 == lastDigit3 );
    }
    public static boolean isValid(int number) {
        return number >= 10 && number <=1000;
    }
}
