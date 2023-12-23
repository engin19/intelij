package class4;

import org.w3c.dom.ls.LSOutput;

public class E4NestedIfCondition {
    public static void main(String[] args) {
        double a=1;
        double b=2;
        double c=3;
        if (a>b){
            if (a>c) System.out.println("the greatest number is "+a);
        }else if (b>c) {
            System.out.println("the greatest number is " + b);
        } else{
                System.out.println("the greatsest number is "+c);
            }
        }











    }
