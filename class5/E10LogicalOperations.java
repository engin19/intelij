package class5;

import java.util.Scanner;

public class E10LogicalOperations {
    /*
Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring”
if user is born in June, July, August →
season =”Summer”  etc …
At the end of the program we should see 1 output as “You were born is season __”.

 */
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.println("Would you please enter your birth month");
        String month= abc.next();
        if (month.equals("January")||(month.equals("February")||month.equals("March")))
        {
            System.out.println("You were born in Winter");
        }else if (month.equals("April")||month.equals("May")||month.equals("June")){
            System.out.println("you were born in Spring");
        }else if (month.equals("July")||month.equals("August")||month.equals("September")){
            System.out.println("you were born in summer");
        }else if (month.equals("October")||month.equals("November")||month.equals("December")){
            System.out.println("you were born in fall");
        }else {
            System.out.println("invalid month");
        }

    }
}
