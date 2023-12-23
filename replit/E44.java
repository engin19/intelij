package replit;

import java.util.Scanner;

public class E44 {
    public static void main(String[] args) {
        System.out.println("Please enter your favorite care make");
        Scanner abc = new Scanner(System.in);
        String car = abc.nextLine();
        switch (car) {
            case "BMW":
                System.out.println("Your favorite car is german car");
                break;
            case "Toyota":
                System.out.println("Your favorite car is japanese car");
                break;
            case "Maserati":
                System.out.println("Your favorite car is italian car");
                break;
            default:
                System.out.println("Your favorite car is unknown");
        }
    }
}