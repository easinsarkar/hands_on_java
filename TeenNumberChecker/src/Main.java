public class Main {
    public static void main(String[] args) {
        System.out.println( hasTeen(22,55,13) );
        System.out.println( hasTeen(22,55,11) );
        System.out.println( hasTeen(22,55,131) );
        System.out.println( isTeen(22) );
        System.out.println( isTeen(17) );
    }
    public static boolean hasTeen(int parameter1, int parameter2, int parameter3) {
        return ( parameter1 >= 13 && parameter1 <= 19 ) || ( parameter2 >= 13 && parameter2 <= 19 ) || ( parameter3 >= 13 && parameter3 <= 19 );
    }
    public static boolean isTeen(int parameter) {
        return ( parameter >= 13 && parameter <= 19 );
    }
}
