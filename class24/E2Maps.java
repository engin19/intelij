package class24;

import java.util.HashMap;
import java.util.Map;

public class E2Maps {
    public static void main(String[] args) {
        Map<String,Integer> fruit=new HashMap<>();
        fruit.put("Apple",20);
        fruit.put("Banana",15);
        fruit.put("Kiwi",5);
        fruit.put("Orange",20);
        fruit.remove("Kiwi");
        System.out.println(fruit);
        fruit.replace("Apple",30);
        System.out.println(fruit);

    }
}
