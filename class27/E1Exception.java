package class27;

public class E1Exception {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("4");
        try{
        System.out.println(10/0);}catch(Exception c){
            System.out.println("Please dont try to divide by zero it is not allowed in Java");
        }
        System.out.println("1");
        System.out.println("4");
        System.out.println("******************************************************");
        // if the try catch block doesn't have any problem it executes the try part.
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("4");
        try{
        System.out.println(10/2);}catch(Exception c){
            System.out.println("Please dont try to divide by zero it is not allowed in Java");
        }
        System.out.println("1");
        System.out.println("4");
    }
}
