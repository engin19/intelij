package class6;

import java.util.Scanner;

public class E26 {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.println("Please enter the starting point");
        int start=abc.nextInt();
        System.out.println("please enter the end");
        int end= abc.nextInt();
        System.out.println("please enter the step size as well ");
        int step=abc.nextInt();
        while(start<=end){
            System.out.print(start+" ");
            start=start=step;
        }
    }
}
