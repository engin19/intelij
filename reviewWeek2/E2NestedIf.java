package reviewWeek2;

public class E2NestedIf {
    public static void main(String[] args) {

        // nested if -- if statement indise another if

        //if (condition) { if (condition){
        // }
        // }

        boolean allergy=true;
        String allergyType="peanut";

        if (allergy){
            System.out.println("Lets check what kind of allergy you have");}
        if (allergyType.equals("peanut")) {
            System.out.println("Please avoid food that contains peanuts");
        }



    }
}
