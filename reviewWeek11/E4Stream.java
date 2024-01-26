package reviewWeek11;

import java.util.Arrays;

public class E4Stream {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,5};
        int sum= Arrays.stream(arr).sum();
        int min= Arrays.stream(arr).min().getAsInt();
        int max= Arrays.stream(arr).max().getAsInt();
        System.out.println(sum+" "+min+" "+max);

    }
}
