package class9;

public class E3Arrays {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,50},
                {25,35,66},
                {80,90,78,45},
                {45,55,66}

        };
        int[] row0=matrix[2];
        System.out.println(row0[0]);
        System.out.println(row0[2]);

for (int i=0; i< row0.length; i++){
    System.out.print(row0[i]+" ");
}



    }
}
