package class24;

import java.util.HashMap;
import java.util.Map;

public class E8Remove {
    public static void main(String[] args) {
        Map<String,Integer> fruit=new HashMap<>();
        fruit.put("Apple",20);
        fruit.put("Banana",15);
        fruit.put("Kiwi",5);
        fruit.put("Orange",20);
        fruit.entrySet().removeIf(e->e.getKey().contains("i"));
//  maps.entrySet().removeIf(e->e.getKey().contains("i"));
        // maps.entrySet().removeIf(e->e.getValue()==5);
        // maps.entrySet().removeIf(e->e.getValue()==5e.getKey().contains("O"));
        fruit.entrySet().removeIf(e->{
            if(e.getValue()==5||e.getKey().toLowerCase().contains("O")){
                return  true;
            }else{
                return false;
            }
        });
        System.out.println(fruit);

    }
}
