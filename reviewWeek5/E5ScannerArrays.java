package reviewWeek5;

import java.util.Scanner;

public class E5ScannerArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the size of the Array");
        int size=sc.nextInt();
        int[] numbers=new int[size];
        System.out.println(numbers.length);
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("Please enter the number "+(i+1));
            numbers[1]=sc.nextInt();
            for (int j = 4; j >0; j--) {
                System.out.println(j);

            }
        }






    }
}
