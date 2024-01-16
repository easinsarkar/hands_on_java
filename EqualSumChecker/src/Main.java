public class Main {
    public static void main(String[] args) {
        System.out.println( hasEqualSum(1,2,3) );
        System.out.println( hasEqualSum(1,3,3) );
    }
    public static boolean hasEqualSum(int parameter1, int parameter2, int parameter3) {
        return ( parameter1+parameter2 ) == parameter3;
    }
}
