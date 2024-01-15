public class WhileDoWhilelooping {
    public static void main(String[] args){
        isEvenNumber();

    }
    public static boolean isEvenNumber( int num){

        return num % 2 == 0;
    }
    public static void isEvenNumber(){
        int number=5;
        int evenCount=0;
        int oddCount =0;

        while (number<=20){
            if(isEvenNumber(number)){
                evenCount++;
                System.out.println(number);
            }else{
                oddCount++;
            }
            if(evenCount==5){
                break;
            }
            number++;
        }
        System.out.println("total odd numbers found "+oddCount+" and total even numbers found "+evenCount);
    }
}
