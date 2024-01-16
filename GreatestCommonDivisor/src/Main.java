public class Main {
    public static void main(String[] args) {
        System.out.println( getGreatestCommonDivisor(25,15) );
        System.out.println( getGreatestCommonDivisor(12,30) );
        System.out.println( getGreatestCommonDivisor(9,18) );
        System.out.println( getGreatestCommonDivisor(81,153) );
        System.out.println( getGreatestCommonDivisor(-25,15) );
    }
    public static int getGreatestCommonDivisor(int first, int second) {
        if ( first < 10 || second < 10 ) {
            return -1;
        } else {
            int small = first;
            int large = second;
            int remainder;

            if ( first > second ) {
                small = second;
                large = first;
            }
            while ( large % small != 0 ) {
                remainder = large % small;
                large = small;
                small = remainder;
            }
            return small;
        }
    }
}
