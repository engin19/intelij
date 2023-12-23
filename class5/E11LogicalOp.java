package class5;

import java.util.Scanner;

public class E11LogicalOp {
    public static void main(String[] args) {
       char grade;
        Scanner abc=new Scanner(System.in);
        System.out.println("Please enter your Quiz");
        double quiz= abc.nextDouble();
        System.out.println("Please enter your Mid Term");
        double midTerm= abc.nextDouble();

        System.out.println("Please enter your Final Score");
        double finalScore= abc.nextDouble();
        double ave=(quiz+midTerm+finalScore)/3;
        if (ave>=90) {
            grade='A';
        }else if (ave>=70){
            grade='B';}
        else if (ave>=50){
            grade='C';
        }else {grade='F';
        }
        System.out.println(grade);





    }
}
