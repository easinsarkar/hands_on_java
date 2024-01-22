package dev.easin;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] newArray = getIntegers(5);
        System.out.println( Arrays.toString(newArray) );
        printArray(sortIntegers(newArray));
    }
    public static int[] getIntegers(int arrayLength) {
        Scanner s = new Scanner( System.in);
        int[] inputArray = new int[arrayLength];
        for ( int i = 0 ; i < arrayLength ; i++) {
            inputArray[i] = s.nextInt();
        }
        return inputArray;
    }
    public static void printArray( int[] inputArray) {
        for ( int i = 0 ; i < inputArray.length ; i++) {
            System.out.println("Element " + i + " contents " + inputArray[i] );
        }
    }
    public static int[] sortIntegers(int[] inputArray) {
       Arrays.sort(inputArray);
       int[] copiedArray = Arrays.copyOf(inputArray, inputArray.length) ;
       for ( int i = 0 ; i < inputArray.length ; i++) {
           inputArray[i] = copiedArray[ inputArray.length-1-i ];
       }
       return inputArray;
    }
}
