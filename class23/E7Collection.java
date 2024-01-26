package class23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class E7Collection {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(10);

        System.out.println(numbers);

        HashSet<Integer> num=new HashSet<>(numbers);
        System.out.println(num);
        LinkedHashSet<Integer>num1=new LinkedHashSet<>(num);
        System.out.println(num1);
        TreeSet<Integer> num2=new TreeSet<>(num);
        System.out.println(num2);
    }
}
