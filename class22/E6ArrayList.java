package class22;

import java.util.ArrayList;

public class E6ArrayList {
    public static void main(String[] args) {
        ArrayList<String>drink=new ArrayList<>();
        drink.add("Coke");
        drink.add("Sprite");
        drink.add("Dr Pepper");
        drink.add("Fanta");

        for (int i = 0; i < drink.size(); i++) {
            String d=drink.get(i);
            if (d.contains("a")||d.contains("e"));
            drink.set(i,"Water");


        } System.out.println(drink);
    }
}
