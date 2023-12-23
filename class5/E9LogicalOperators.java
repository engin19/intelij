package class5;

import java.util.Scanner;

public class E9LogicalOperators {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.println("Please enter current time in  24H format");
        int time= abc.nextInt();
        if (time>=1&&time<=11) {
            System.out.println("Morning");
        }else if (time>=12&&time<=15){
                System.out.println("Afternoon");
            }else if (time>=16&&time<=20){
                System.out.println("Evening");
            }else if (time>=21&&time<=24){
                System.out.println("Night");
            }else {
            System.out.println("invalid time");
        }
        }
    }

