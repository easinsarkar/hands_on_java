public class main {
    public static void main(String[] args) {
        printConversion(-99);
    }

        public static long toMilesPerHour(double kilometersPerHour){
            if (kilometersPerHour<0){
                return -1;
            }else{
                double milesPerHour = kilometersPerHour*0.277778;
                long rounded = Math.round(milesPerHour);
                return rounded;
            }
        }
        public static void printConversion(double kilometersPerHour){
            if(kilometersPerHour<0){
                System.out.println("invalid value");
            }else {
                System.out.println(kilometersPerHour + "km/hr= " + toMilesPerHour(kilometersPerHour) + " mi/hr");
            }
        }

}
