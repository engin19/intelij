package Practice;

import java.util.HashMap;

public class E1HashMap {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<String, String>();
        //add a key and value
        countries.put("USA","Washington DC.");
        countries.put("Russia","Moscow");
        countries.put("Turkey","Ankara");
        countries.put("Colombia","Bogota");
        System.out.println(countries);
        for (String i: countries.keySet()){
            System.out.print(i+"\t"+"= ");
            System.out.println(countries.get(i));

        }






    }
}