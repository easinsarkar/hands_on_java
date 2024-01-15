import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args){
        int count=1;
        double number;
        double sum=0;

        while (count<=5){

            try {
                System.out.println("Please Enter a valid Integer number "+count+": ");
                number = Double.parseDouble((new Scanner(System.in)).nextLine());
                sum = sum+number;    // this line will not execute if any exception occurred in the previous line
                count++;
            }catch (NumberFormatException invalidInput){
                System.out.println("Please Enter a valid Integer number, error occurred: " + invalidInput.getMessage());
            }
        }
        System.out.println("Sum of those 5 numbers is "+sum);
    }
}
