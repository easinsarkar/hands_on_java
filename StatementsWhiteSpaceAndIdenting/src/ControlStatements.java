public class ControlStatements {
    public static void main(String[] args){
        System.out.println("2 is "+(isPrime(2)?"":"NOT ")+"a prime number");
        System.out.println("1 is "+(isPrime(1)?"":"NOT ")+"a prime number");
        System.out.println("Total prime numbers from 99 to 1000 is "+primeNumberCounter(99));


        int minimumNumber= 100;
        int maximumNumber = 1000;
        int sum = 0;
        int count = 0;
        System.out.println( "required 5 numbers that are divisible by both 3 and 5 between "+ minimumNumber +" to " +maximumNumber+ " are ");
        for ( int currentNumber = minimumNumber; currentNumber<=maximumNumber; currentNumber++){
            if (currentNumber%3==0 && currentNumber%5==0){
                sum = sum + currentNumber;
                count++;
                System.out.println(currentNumber);
            }
            if( count == 5){
                break;
            }
        }
        System.out.println( "summation of the above numbers is "+sum);

    }
    public static boolean isPrime(int wholeNumber){
        if (wholeNumber<2){
            return false;
        }
        for (int divisor = 2; divisor<=wholeNumber/2; divisor++){
            if(wholeNumber%divisor==0){
                return false;
            }
        }
        return true;
    }
    public static int primeNumberCounter( int minimumNumber){
        int count=0;
        for(int currentNumber= minimumNumber; currentNumber<=1000; currentNumber++ ){
            if(isPrime(currentNumber)){
                count++;
            }
//            if( count==3)
//                break;
        }
        return count;

    }

}
