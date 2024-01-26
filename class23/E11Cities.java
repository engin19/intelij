package class23;

import java.util.LinkedHashSet;

public class E11Cities {
    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Ankara");
        cities.add("Dallas");
        cities.add("Antalya");
        cities.add("Houston");
        cities.add("LA");
        System.out.println(cities);
      cities.removeIf(x->(x.startsWith("A")));
        System.out.println(cities);
            }
        }
