package reviewWeek7;

public class E2Method {
    static int arr(int[] number) {
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];

        }
        System.out.println(sum);
        return sum;


    }
}