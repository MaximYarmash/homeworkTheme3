package src;

public class Task3 {
    public static void main(String... args) {
        int hour = 22;
        if (hour >= 12) {
            if (hour <= 16) {
                System.out.println("Good day");
            }
        }
        if (hour >= 4) {
            if (hour <= 11) {
                System.out.println("Good morning");
            }
        }
        if (hour >= 16) {
            if (hour < 24) {
                System.out.println("Good evening");
            } else {
                System.out.println("Good night");
            }
        }
    }
}