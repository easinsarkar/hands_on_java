import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double number;
        double minNumber=0;
        double maxNumber=0;
        boolean isnumber=true;

        while(isnumber){
            System.out.println("enter any key to quit this system or enter any number to continue the process ");

            String data=scanner.nextLine();
            try{
                number= Double.parseDouble(data);
                if(minNumber==0 && maxNumber==0){
                    minNumber=number;
                    maxNumber=number;
                }
                if(number<minNumber){
                    minNumber=number;
                }
                if(number>maxNumber){
                    maxNumber=number;
                }
            }catch (NumberFormatException invalidInput){
                System.out.println("your last input is not a number");
                isnumber=false;
            }
        }
            System.out.println("among the numbers you have entered the minimum number is "
                    + minNumber + " the maximum number is " + maxNumber);
    }
}
