package class9;

public class E10Arrays {
    public static void main(String[] args) {
        //Create a 2D array or integer type where you will store odd and even numbers
        // Develop a program which will identify/print the even numbers only
        int[][] num = {
                {12, 15, 26, 98},
                {25, 36, 78, 25},
                {58, 24, 57, 45}
        };
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] % 2 == 0) {
                    System.out.println(num[i][j] + " ");
                }
            }

        }
    }
}