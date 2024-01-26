package class24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class E3Maps {
    public static void main(String[] args) {
        Map<String,Integer> fruit=new HashMap<>();
        fruit.put("Apple",20);
        fruit.put("Banana",15);
        fruit.put("Kiwi",5);
        fruit.put("Orange",20);
        System.out.println(fruit);
        System.out.println(fruit.keySet());
        System.out.println(fruit.values());
        Set<String> keys=fruit.keySet();
        ArrayList<String>arrayList=new ArrayList<>(keys);
        for (String k:keys){
            System.out.println(k);
        }






    }
}
