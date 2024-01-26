package class23;

import java.util.TreeSet;

public class E6Sets {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(20);
        numbers.add(10);
        numbers.add(15);
        numbers.add(68);
        numbers.add(68);
        System.out.println(numbers);
        for (int n : numbers) {
            if (n >=20) {
                System.out.println(n);
            }
        }
    }
}