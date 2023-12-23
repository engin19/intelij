package homework;

public class E3SecondMethod {
    public static void main(String[] args) {
        //Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
        // Print the sum of all numbers.
        int[][] num={
                {24,36,27},
                {12,85,98},
                {54,68,72}
        }; int sum=0;
        for (int[] n: num){
            for(int m:n){
               sum=sum+m;
            }
        } System.out.println(sum);
    }
}
