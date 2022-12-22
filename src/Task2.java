package src;

import java.util.Scanner;

public class Task2 {
    public static void main(String... args) {
        System.out.println("Enter number of day");
        Scanner scanner = new Scanner(System.in);
        int dayNow = scanner.nextInt();
        if (dayNow == 1) {
            System.out.println("Monday");
        } else {
            if (dayNow > 7) {
                System.out.println("Please enter number 1-7");
            }
            if (dayNow < 1) {
                System.out.println("Please enter number 1-7");
            }
            if (dayNow == 2) {
                System.out.println("Tuesday");
            }
            if (dayNow == 3) {
                System.out.println("Wednesday");
            }
            if  (dayNow == 4) {
                System.out.println("Thursday");
            }
            if (dayNow == 5) {
                System.out.println("Friday");
            }
            if (dayNow == 6) {
                System.out.println("Saturday");
            }
            if (dayNow == 7) {
                System.out.println("Sunday");
            }
        }
    }
}