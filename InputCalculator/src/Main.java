import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner s = new Scanner(System.in);
        boolean valid = true;
        int sum = 0;
        double avg;
        int count = 0;
        int input;
        while ( valid ) {
            try {
                input = s.nextInt();
                sum = sum + input;
                count++;
            } catch ( InputMismatchException e) {
                valid = false;
            }
        }
        avg = (double) sum / count;
        avg = Math.round( avg );

        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
