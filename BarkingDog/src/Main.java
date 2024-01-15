public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,5));
        System.out.println(shouldWakeUp(true,8));
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        return barking && ( ( hourOfDay < 8 && hourOfDay >= 0 ) || hourOfDay == 23 );
    }
}
