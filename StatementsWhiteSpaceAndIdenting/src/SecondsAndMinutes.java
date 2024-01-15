public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(555)); // first test
        System.out.println(getDurationString(100, 40)); //second test

    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid input";
        } else {
            int hours = seconds / 3600;
            int minutes = (seconds % 3600) / 60;
            seconds = (seconds % 3600) % 60;
            return hours + "h" + " " + minutes + "m" + " " + seconds + "s";
        }
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds <= 59) {
            seconds = minutes * 60 + seconds;
            return getDurationString(seconds);
        } else {
            return "Invalid input";
        }

    }

}