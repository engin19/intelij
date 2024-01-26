package class24;

import java.util.HashMap;
import java.util.Map;

public class E1Maps {
    public static void main(String[] args) {

        Map<String,Integer> fruit=new HashMap<>();

        // this is also duable since it is interface


       // HashMap<String,Integer> fruit=new HashMap<>();

        fruit.put("Apple",20);
        fruit.put("Banana",15);
        fruit.put("Kiwi",5);
        fruit.put("Orange",20);
        // if we give same key with different value  it will override the previous one.
        // Orange 20 to Orange 25

        fruit.put("Orange",25);
        System.out.println(fruit);
        System.out.println(fruit.size());
        System.out.println(fruit.containsKey("Apple"));
        System.out.println(fruit.containsValue(5));
        System.out.println(fruit.containsValue(25));
        System.out.println(fruit.containsKey("Legs"));
        System.out.println(fruit.isEmpty());
        System.out.println(fruit.get("Kiwi"));



    }
}
