public class Task4 {
    public static void main(String... args) {
        int hour = 9;
        String textgreetings;
        switch (hour) {
            case 24:
            case 1:
            case 2:
            case 3:
            case 4:
                textgreetings = "Good night";
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                textgreetings = "Good morning";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                textgreetings = "Good day";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                textgreetings = "Good evening";
                break;
            default:
                textgreetings = "Unknown";
        }
        System.out.println(textgreetings);
    }
}


