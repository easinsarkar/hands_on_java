public class Main {
    public static void main(String[] args) {
        System.out.println( getLargestPrime(4) );
//        System.out.println( getLargestPrime(217) );
//        System.out.println( getLargestPrime(3) );
//        System.out.println( getLargestPrime(45) );
//        System.out.println( getLargestPrime(-1) );
    }
    public static int getLargestPrime(int number) {
        if ( number <= 1 ) {
            return -1;
        } else {
            int divisor = 1;
            int factor = 1;
            int max = 0;
            while ( divisor <= number ) {
                if ( number % divisor == 0 ) {
                    factor = divisor;
                }
                int i = 2;
                boolean flag = true;
                while ( i <= factor/2 && i >= 2 ) {
                    if ( factor % i == 0 ) {
                        flag = false;
                        break;
                    }
                    i++;
                }
                if ( flag && factor > max ) {
                    max = factor;
                }
                divisor++;
            }
            return max;
        }
    }
}
