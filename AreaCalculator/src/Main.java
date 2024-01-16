public class Main {
    public static void main(String[] args) {
        System.out.println( area(10) );
        System.out.println( area(-5.0) );
        System.out.println( area(5.0,-45.2) );
        System.out.println( area(5.0,5.2) );

    }
    public static double area(double radius) {
        if ( radius < 0 ) {
            return -1;
        } else {
            return radius*radius*3.1415926535897932;
        }
    }
    public static double area(double x, double y) {
        if ( x < 0 || y < 0 ) {
            return -1;
        } else {
            return x*y;
        }
    }
}
