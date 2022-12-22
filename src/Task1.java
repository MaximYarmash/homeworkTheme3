package src;

public class Task1 {
    public static void main(String... args) {
        int dayNow = 3;
        String textdayNow;
        switch (dayNow) {
            case 1:
                textdayNow = "Monday";
                break;
            case 2:
                textdayNow = "Tuesday";
                break;
            case 3:
                textdayNow = "Wednesday";
                break;
            case 4:
                textdayNow = "Thursday";
                break;
            case 5:
                textdayNow = "Friday";
                break;
            case 6:
                textdayNow = "Saturday";
                break;
            case 7:
                textdayNow = "Sunday";
            default:
                textdayNow = "Unknown";
        }
        System.out.println(textdayNow);
    }
}
