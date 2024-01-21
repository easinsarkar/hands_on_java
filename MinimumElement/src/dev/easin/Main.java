package dev.easin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int length = readInteger();
        int[] newArray = readElements(length);
        System.out.println( findMin( newArray));
    }
    private static int readInteger() {
        System.out.println("How many number you wanna enter?");
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }
    private static int[] readElements( int parameter ) {
        Scanner s = new Scanner( System.in);
        System.out.println("Enter the numbers: ");
        int[] inputArray = new int[parameter];
        for ( int i = 0 ; i < parameter ; i++) {
            inputArray[i] = s.nextInt();
        }
        return inputArray;
    }
    private static int findMin( int[] inputArray) {
        inputArray = readElements(readInteger());
        int min = inputArray[0];
        for ( int i = 0 ; i < inputArray.length ; i++) {
            if ( inputArray[i] < min ) {
                min = inputArray[i];
            }
        }
        return min;
    }
}
