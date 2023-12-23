package replit;

import java.util.Scanner;

public class E36 {
    public static void main(String[] args) {
        System.out.println("Please enter two strings");
        Scanner abc=new Scanner(System.in);
        String word1=abc.nextLine();
        String word2=abc.nextLine();
        System.out.println("Please enter two numbers");
        int int1 =abc.nextInt();
        int int2=abc.nextInt();

        if (int1 == int2 && word1.equals(word2)) {
            System.out.println("AND");
        } else if(int1==int2||word1.equals(word2)){
            System.out.println("OR");
        }else if(int1!=int2||!word1.equals(word2)){
            System.out.println("NONE");}
        abc.close();

    }
}
