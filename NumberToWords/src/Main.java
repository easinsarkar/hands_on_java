public class Main {
    public static void main(String[] args) {
        System.out.println( getDigitCount(0) );
        System.out.println( getDigitCount(123) );
        System.out.println( getDigitCount(-12) );
        System.out.println( getDigitCount(5200) );
        System.out.println( reverse(-121) );
        System.out.println( reverse(1212) );
        System.out.println( reverse(1234) );
        System.out.println( reverse(100) );
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);

    }
    public static int getDigitCount(int number) {
        if ( number < 0 ) {
            return -1;
        } else if ( number == 0 ) {
            return 1;
        } else {
            int i;
            for ( i = 0; number > 0; i++ ) {
                number = number / 10;
            }
            return i;
        }
    }
    public static int reverse(int number) {
        int reverse = 0;
        int interim = number;
        while ( interim != 0 ) {
            reverse = reverse*10 + interim%10;
            interim = interim/10;
        }
        return reverse;
    }
    public static void numberToWords(int number) {
        int count = getDigitCount(number);
        number = reverse(number);
        if ( number < 0 ) {
            System.out.println("Invalid Value");
        } else {
            int i;
            int splitDigit = 0;
            for ( i = count; i > 0; i--) {
                splitDigit = number % 10;
                number = number / 10;
                switch( splitDigit ) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            }
        }
    }
}
