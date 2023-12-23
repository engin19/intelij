package class4;

import java.util.Scanner;

public class E9Scanner {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.println("How much money do you need to barrow?");
        int money=abc.nextInt();
        if (money<=200000){
            System.out.println("yes i can lend you "+money);
        }else{
            System.out.println("i cant give you that much money");
        }

        }

    }

