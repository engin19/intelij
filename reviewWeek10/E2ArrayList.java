package reviewWeek10;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
// you cant get auto down-casting on classes

        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(15.2);
        numbers.add(18.2);
        numbers.add(36.8);
        numbers.add(31.0);
        numbers.add(50.0);
        numbers.add(25.0);


        System.out.println(numbers);
        numbers.remove(0);
        System.out.println(numbers);
        numbers.remove(25.0);
        System.out.println(numbers);

    }
}