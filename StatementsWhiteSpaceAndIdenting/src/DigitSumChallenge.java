public class DigitSumChallenge {
    public static void main(String[] args){
        System.out.println("sum of the digits of given number is "+ sumDigit(-888));
    }
    public static int sumDigit(int number){
        if(number<0){
            return (-1);
        }else{
            int sum=0;
            while (number>0) {
                int remainder = number%10;
                sum=sum+remainder;
                number=number/10;
            }
            return sum;
        }
    }
}
