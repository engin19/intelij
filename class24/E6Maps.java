package class24;

import java.util.LinkedHashMap;
import java.util.Map;

public class E6Maps {
    public static void main(String[] args) {
        Map<Integer,String> building=new LinkedHashMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"Syntax");
        building.put(4,"Oracle");
        building.put(5,"Microsoft");
        building.put(6,"ABA");
        building.put(7,"Tesla");
        building.forEach((k,v)-> System.out.println(k));
        building.forEach((k,v)-> System.out.println(v));
        building.forEach((k,v)-> System.out.println(k+" "+v));
        System.out.println("**********************");
        building.forEach((k,v)-> {
            if (v.contains("A")){
                building.forEach((a,b)-> System.out.println(a+" "+b));
            }


        });
    }
}
