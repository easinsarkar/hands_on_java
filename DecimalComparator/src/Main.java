public class Main {
    public static void main(String[] args) {
        System.out.println( areEqualByThreeDecimalPlaces(3.1756,3.175) );
        System.out.println( areEqualByThreeDecimalPlaces(3.16,3.16) );
    }
    public static boolean areEqualByThreeDecimalPlaces(double parameter1, double parameter2) {
        parameter1 = (int) (parameter1*1000);
        parameter2 = (int) (parameter2*1000);
        return parameter1 == parameter2;
    }
}