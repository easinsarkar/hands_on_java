public class ConvertFeetToCentimeters {
    public static void main(String[] args){
        System.out.println("Your height in centimeters is "+ convertToCentimeters(5,8));

    }
    public static double convertToCentimeters(int heightInInches){
        return heightInInches*2.54d;
    }
    public static double convertToCentimeters(int heightInFeet, int remainingInInches){
        int totalHeightInInches = (heightInFeet*12) + remainingInInches;
        return convertToCentimeters(totalHeightInInches);
    }

}
