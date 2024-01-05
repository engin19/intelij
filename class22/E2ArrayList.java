package class22;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        ArrayList <String>names=new ArrayList<>();
        System.out.println(names.size());
        names.add("Engin");
        System.out.println(names.size());
        names.remove("Engin");
        System.out.println(names.size());
        System.out.println(names.contains("Engin"));


    }
}
