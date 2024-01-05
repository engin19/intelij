package class22;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Maria");
        System.out.println(names.size());
        names.add("Poorna");
        names.add("Damla");
        names.add("Kamla");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Damla"));
        // you can remove  using the name or you can use the index number.
        System.out.println(names.remove("Kamla"));
        System.out.println(names.remove(2));
        System.out.println(names.size());
        System.out.println(names.get(0));
        names.set(0,"Nasima");
        System.out.println(names.get(0));
        System.out.println(names);
        System.out.println(names.indexOf("Poorna"));

    }
    }


