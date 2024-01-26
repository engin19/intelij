package class24;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String,Integer> employee=new LinkedHashMap<>();
        employee.put("Engin",105000);
        employee.put("Aileen",12000000);
        employee.put("Cooper",105000);
        String name=" ";
        int salary=0;
        for (var e:employee.entrySet()){
            if (e.getValue()>salary){
                name=e.getKey();
                salary=e.getValue();
            }
        }
        System.out.println(name+"=$"+salary);

    }
}
