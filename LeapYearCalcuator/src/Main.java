public class Main {
    public static void main(String[] args) {
        System.out.println( isLeapYear(1900) );
        System.out.println( isLeapYear(1996) );
    }
    public static boolean isLeapYear(int year) {
        if ( year > 0 && year < 9999 ) {
            return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
        } else {
            return false;
        }
    }
}
