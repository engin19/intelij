package class24;

import java.util.TreeMap;

public class E9Maps {
    public static void main(String[] args) {
        TreeMap<String,String> countries=new TreeMap<>();
        countries.put("Usa","Washington DC");
        countries.put("Italy","Rome");
        countries.put("Turkey","Ankara");
        countries.put("Colombia","Bogota");
        countries.put("Spain","Madrid");
        countries.forEach((k,v)-> System.out.println(k));
        System.out.println("***************************");
        countries.forEach((k,v)-> System.out.println(v));
        System.out.println("***************************");
        countries.forEach((k,v)-> System.out.println(k+" "+v));

    }
}
