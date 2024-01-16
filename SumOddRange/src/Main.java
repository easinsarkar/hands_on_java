public class Main {
    public static void main(String[] args) {
        System.out.println( isOdd(42));
        System.out.println( isOdd(41));
        System.out.println( isOdd(-42));
        System.out.println( sumOdd(1,11) );
        System.out.println( sumOdd(-1,100) );
        System.out.println( sumOdd(100,-100) );
        System.out.println( sumOdd(13,13) );

    }
    public static boolean isOdd(int number) {
        return number % 2 != 0 && number >= 1;
    }
    public static int sumOdd(int start, int end) {
        if ( start < 1 || end < 1 || end < start ) {
            return -1;
        } else {
            int sum = 0;
            for ( int i = start ; i <= end ; i++ ) {
                if ( isOdd(i) ) {
                    sum = sum + i;
                }
            }
            return sum;
        }
    }
}
