public class SwitchStatement {
    public static void main(String[] args){
        char charVariable = 'C';
        switch(charVariable){
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.println("not matched");
                break;

        }
        printDayOfWeek(5);
        printDayOfWeek(4);
        printWeekDay(2);

    }
    public static void printDayOfWeek(int day){
        String nameOfDay;
        switch(day){
            case 0-> nameOfDay="Sunday";
            case 1-> nameOfDay="Monday";
            case 2-> nameOfDay="Tuesday";
            case 3-> nameOfDay="Wednesday";
            case 4-> nameOfDay="Thursday";
            case 5-> nameOfDay="Friday";
            case 6-> nameOfDay="Saturday";
            default -> nameOfDay="invalid input";
        }
        System.out.println("Your number is "+day+" and day of the week is "+nameOfDay);

    }
    public static void printWeekDay(int day){
        String nameOfDay;
        if(day == 0){
            nameOfDay="Sunday";
        }else if(day == 1){
            nameOfDay="Monday";
        }else if(day == 2){
            nameOfDay="Tuesday";
        }else if(day == 3){
            nameOfDay="Wednesday";
        }else if(day == 4){
            nameOfDay="Thursday";
        }else if(day == 5){
            nameOfDay="Friday";
        }else if(day == 6){
            nameOfDay="Saturday";
        }else {
            nameOfDay="invalid input";
        }
        System.out.println("Your number is "+day+" and day of the week is "+nameOfDay);
    }

}
