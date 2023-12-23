package replit;

import java.util.Scanner;

public class E76 {
    public static void main(String[] args) {
        String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        Scanner abc=new Scanner(System.in);
        for(int i=0;i<days.length; i++){

            System.out.println("Please enter day "+(i+1)+ "  of the week");

            System.out.println(days[i]);

        }
    }
}
