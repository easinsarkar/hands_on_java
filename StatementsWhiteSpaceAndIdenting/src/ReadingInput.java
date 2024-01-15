import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args){
        int currentYear=2023;
        try {
            System.out.println(getInputFromConsole(currentYear));
        }catch ( NullPointerException er){
          System.out.println(getInputFromScanner(currentYear));
        }
    }
    public static String getInputFromConsole(int currentYear){
        int name = Integer.parseInt(System.console().readLine("Hi! what's your age?"));
        System.out.println("hi "+name+", it's me your childhood friend");
        return "";
    }
    public static String getInputFromScanner(int currentYear){
//        Scanner sc = ;
        System.out.println("Input your name and press [ENTER KEY]");
        String name =  (new Scanner(System.in)).nextLine();

        System.out.println("hi "+name+", it's me your childhood friend");
        return "";
    }
}
