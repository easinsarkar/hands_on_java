import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] newArray = new int[] {4,4,6,6,6,7,8,};
        reverse(newArray);
    }
    private static void reverse(int[] inputArray) {
        System.out.println( "Array = " + Arrays.toString(inputArray) );
        int[] copiedArray = Arrays.copyOf(inputArray, inputArray.length) ;
        for ( int i = 0 ; i < inputArray.length ; i++) {
            inputArray[i] = copiedArray[ inputArray.length-1-i ];
        }
        System.out.println( "Reversed Array = " + Arrays.toString(inputArray) );
    }
}
