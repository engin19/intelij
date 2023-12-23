package homework;

public class Class17Task2 {

    public static double min(double a, double b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
    public static int min(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;


        }
    }

    public static void main(String[] args) {
        System.out.println(min(10,5));
        System.out.println(min(2.5,8.5));

    }
}


