package class5;

import java.util.Scanner;

public class E8LogicalOperators {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        int num= abc.nextInt();
        if (num>=1&&num<=10){
            System.out.println("Small");
        }else if (num>=11&&num<=100)
        {System.out.println("medium");
        }else if (num>=101&&num<=1000){
            System.out.println("Large");
        }
    }
}
