package class8;

public class E12EnhancedForLoop {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 3, 0, 45, 2, 6, 8, 9, 54, 63};
        boolean isS=true;
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] > numbers[i+ 1] ) {
                isS=false;
                break;


            }
        }
        System.out.println("Is loop sorted: "+isS);
    }
}