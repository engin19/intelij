package class9;

public class E2DArrays {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,50},
                {25,35,66},
                {80,90,78,45},
                {45,55,66}

        };
        System.out.println(matrix[1][1]);//35
        System.out.println(matrix[2][3]);//78
        System.out.println(matrix[3][1]);//55
        System.out.println(matrix.length);//gives number of rows
        System.out.println(matrix[0].length);
        System.out.println(matrix[2].length);
    }
}

