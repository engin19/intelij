package class7;

public class E10Arrays {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 44, 33, 56};
       /* System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);*/
        int sum=0;
        for(int j= 0; j< 5; j++) {
            sum=sum+numbers[j];
        } System.out.println(sum);
    }
}
