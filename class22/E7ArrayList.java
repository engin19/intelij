package class22;

import java.util.ArrayList;

public class E7ArrayList {
    //if
    public static void main(String[] args) {
        ArrayList<String> drink=new ArrayList<>();
        drink.add("Coke");
        drink.add("Sprite");
        drink.add("Dr Pepper");
        drink.add("Fanta");

        drink.removeIf(d->d.endsWith("e"));
        drink.removeIf(d->d.endsWith("a"));
        drink.removeIf(a->a.endsWith("z"));
        System.out.println(drink);
        }
    }
