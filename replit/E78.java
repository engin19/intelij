package replit;

import java.util.Scanner;

public class E78 {
    public static void main(String[] args) {
        int[] num=new int[5];
        Scanner abc=new Scanner(System.in);
        num[0]=abc.nextInt();
        num[1]=abc.nextInt();
        num[2]=abc.nextInt();
        num[3]=abc.nextInt();
        num[4]=abc.nextInt();
        for(int i=0;i<num.length;i++){
            System.out.print((num[i]*10)+" ");
        }
    }
}
