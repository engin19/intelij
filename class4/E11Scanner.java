package class4;

import java.util.Scanner;

public class E11Scanner {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Please enter your city");
        String city=abc.nextLine();
        System.out.println(" what is the current temperature in your city");
        double temp = abc.nextInt();
        System.out.println((("it is " + (((temp-32)*5/ 9))) + " Celsius right now in Dallas"));

    }
}


