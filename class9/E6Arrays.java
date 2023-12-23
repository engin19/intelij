package class9;

public class E6Arrays {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 50},
                {25, 35, 66},
                {80, 90, 78, 45},
                {45, 55, 66}

        };
//if i move the int sum=0; to this line it will get the sum of each line.
        for (int row = 0; row < matrix.length; row++) {
            int sum = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                sum=sum+matrix[row][column];
            }
            System.out.println(sum);
        }
    }
}