public class Main {
    public static void main(String[] args) {
        System.out.println( isPalindrome(1221) );
        System.out.println( isPalindrome(-1221) );
        System.out.println( isPalindrome(1121) );
    }
    public static boolean isPalindrome(int number) {
        if ( number < 0 ){
            number = number*( -1 );
        }
        int reverse = 0;
        int interim = number;
        while ( interim != 0 ) {
            reverse = reverse*10 + interim%10;
            interim = interim/10;
        }
        return reverse == number;
    }
}
