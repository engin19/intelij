package class22;

import java.util.ArrayList;

public class Task1ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Maria");
        names.add("Poorna");
        names.add("Damla");
        names.add("Kamla");
        names.add("Carlos");
        System.out.println(names.isEmpty());
        System.out.println("_____________________________");
        System.out.println(names.contains("Damla"));
        System.out.println("_____________________________");
        System.out.println(names.size());
        System.out.println("_____________________________");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));

        }
    }
}
