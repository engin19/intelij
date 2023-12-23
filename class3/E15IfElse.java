package class3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class E15IfElse {
    public static void main(String[] args) {

        int time=21;
        if (time<20) {
            System.out.println("good evening");
        }else if (time>20){
            System.out.println("good night");}
        else if (time==20){
            System.out.println("good morning");}

        int age=38;
        if (age<18) {
            System.out.println("you are a teenager, please dont work ");
        }else {
                System.out.println(" you are older than 18 ");
                if (age<64) {
                    System.out.println("you are eligible to work ");
                }else {
                        System.out.println("enjoy your life");
                    }
                }

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scan.nextLine();
        System.out.println("your name is "+name);

        Scanner abc=new Scanner(System.in);
        System.out.println("Please enter your DOB");
        String bod=abc.nextLine();
        System.out.println("you were born in "+bod);
          int month=18;
          switch(month){
              case 1:
                  System.out.println("January ");
                  break;
              case 2:
                  System.out.println("Febuary");
                  break;
              case 3:
                  System.out.println("March");
                  break;
              case 4:

                  System.out.println("April");
              break;
              case 5:
                  System.out.println("May");
                  break;
              case 6:
                  System.out.println("June");
                  break;
              case 7:
                  System.out.println("July");
                  break;
              case 8:
                  System.out.println("August");
                  break;
              case 9:
                  System.out.println("September");
                  break;
              case 10:
                  System.out.println("October");
                  break;
              case 11:
                  System.out.println("November");
                  break;
              case 12:
                  System.out.println("December");
                  break;
              default:{
                  System.out.println("this is not a month");


          }




            }
    }
}


