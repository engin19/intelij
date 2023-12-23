package Tekrarlar;

public class E3Arrays {
    public static void main(String[] args) {
        int[] numbers={10,20,65,95,37,15,45,22};
        int sum=0;
        for (int i = 1; i < numbers.length; i+=2) {
            sum=sum+numbers[i];

        } System.out.println(sum);
        }

}
