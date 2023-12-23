package homework;

public class E3 {
    public static void main(String[] args) {
        int[][] num={
                {24,36,27},
                {12,85,98},
                {54,68,72}
        }; int sum=0;
        for (int i=0; i< num.length;i++){
            for (int j=0; j<num[i].length; j++){
                sum=sum+num[i][j];

            }

        }System.out.println("The sum of all the numbers in 'num' array is "+sum);
    }
}
