package class24;

import java.util.LinkedHashMap;

public class E5MapsTask {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> building=new LinkedHashMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"Syntax");
        building.put(4,"Oracle");
        building.put(5,"Microsoft");
        building.put(6,"ABA");
        building.put(7,"Tesla");
        System.out.println(building.size());
        building.replace(4,"Amazon");
        building.remove(7);
        System.out.println(building);
        building.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
