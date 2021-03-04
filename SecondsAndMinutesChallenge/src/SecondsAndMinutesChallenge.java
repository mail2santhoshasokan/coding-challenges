public class SecondsAndMinutesChallenge {
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return "Invalid value";
        }
        int hours = minutes / 60;
        int min = minutes % 60;
        return hours + "h" + min + "m" + seconds + "s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        int minutes = seconds / 60;
        int sec = seconds % 60;
        System.out.println(minutes + "min" + sec + "s");
        return getDurationString(minutes, sec);
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
    }
}
