public class Hello {
    public static void main(String[] args) {
        System.out.println("Bismillah");
        double a = 20.00;
        double b = 80.00;
        double result = (a+b)*100.00;
        System.out.println(result);
        double remainder = result % 40.00;
        boolean BooleanValue = remainder==0.00?true:false;
        System.out.println(BooleanValue);
        if(!BooleanValue){
            System.out.println("got some remainder");
        }
    }
}
