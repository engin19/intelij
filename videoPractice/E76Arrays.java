package videoPractice;

import java.util.Scanner;

public class E76Arrays {
    public static void main(String[] args) {
        String[] daysOfWeek = new String[7];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            System.out.println("Please enter day " + (i + 1) + " of the week:");
            daysOfWeek[i] = scanner.nextLine();
        }

        scanner.close();

        System.out.println("Days of the week:");

        for (String day : daysOfWeek) {
            System.out.println(day);
        }
    }
}

