package reviewWeek2;

public class E4NestedIfHomework {
    public static void main(String[] args) {

        double gpa= 3.5;
        boolean degree=true;
        if (degree==true){
            System.out.println("Congratulations");
           if (gpa>=3.5){
            System.out.println("You are eligible for Scholarship");
        }   else if (gpa<3.5){
            System.out.println("You should have studied harder");
        }
        } else{
            System.out.println("you should get a degree");
        }




    }
}
