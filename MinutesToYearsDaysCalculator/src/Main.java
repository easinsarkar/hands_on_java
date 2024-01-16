public class Main {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(561600);
        printYearsAndDays(-6164400);

    }
    public static void printYearsAndDays(long minutes) {
        if ( minutes < 0 ) {
            System.out.println( "Invalid Value" );
        } else {
            long years = minutes / 525600;
            long days = ( minutes % 525600 ) / 1440;
            System.out.println( minutes + " min = " + years + " y and " + days + " d");
        }
    }
}