package class5;

import java.util.Scanner;

public class E7LogicalOp {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.println("Please enter a number");
        int day= abc.nextInt();
        if (day>=1&&day<=5){
            System.out.println("It is a weekday");
        }else if (day==6||day==7){
            System.out.println("It is a weekend");
        }else{
            System.out.println("Invalid Day");
        }








    }
}
