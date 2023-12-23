package homework;

public class E4 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };int sum=0;
        for (int[] n:array){
            for (int abc:n){
                sum=sum+abc;

            }
        }
        System.out.println(sum);
    }
}
