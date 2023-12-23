package class4;

import java.util.Scanner;

public class E12Scanner {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.println("Do you have credit card?");
        String credit=abc.nextLine();
        if(credit.equals("Yes"));
        System.out.println("what is your Credit limit?");
        int limit= abc.nextInt();
        if (limit>1000){
            System.out.println("pay off immediately");
        }else{
            System.out.println("You can spend some more");
        }
    }}
