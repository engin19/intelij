package class4;

import java.util.Scanner;
//You are DMV representative and you need to ask customer their
// age. If they are 18 or older you will issue a driver
// license to them, otherwise you will offer them to get a
// learners permit.
public class E10Scanner {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age= abc.nextInt();
        if (age>=18){
            System.out.println("DMV will issue a driver license");}
        else {
            System.out.println("We will issue a Learner permit");
        }






    }
}
