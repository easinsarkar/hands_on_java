public class Main {
    public static void main(String[] args) {
        System.out.println( getEvenDigitSum(123456789) );
        System.out.println( getEvenDigitSum(252) );
        System.out.println( getEvenDigitSum(-22) );
    }
    public static int getEvenDigitSum(int number) {
        if ( number < 0 ) {
            return -1;
        } else {
            int digit = 0;
            int evenDigit = 0;
            int sum = 0;
            while ( number > 0 ) {
                digit = number % 10;
                if ( digit % 2 == 0 ) {
                    evenDigit = digit;
                    sum = sum + evenDigit;
                }
                number = number / 10;
            }
            return sum;
        }
    }
}
