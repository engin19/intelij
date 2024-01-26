package class24;

import java.util.HashMap;
import java.util.Map;

public class HW2 {
    public static void main(String[] args) {
        /*Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.*/
        Map<Integer, String> bestBuy = new HashMap<>();
        bestBuy.put(7664847,"Printer");
        bestBuy.put(7879885,"Tv");
        bestBuy.put(123458,"Pencil Sharpener");
        bestBuy.put(98745,"Projector");
        bestBuy.put(456987,"Computer Desk");
       var set1=bestBuy.entrySet();
       for (var set2:set1){
           System.out.println(set2);
       }
        System.out.println("*******************************");
        System.out.println("With Lambda ");
        bestBuy.forEach((id,item)-> System.out.println("ID: "+id+"Name: "+item));
        }


    }
