package class22;

import java.util.ArrayList;

public class E2TaskArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Maria");
        names.add("Poorna");
        names.add("Damla");
        names.add("Kamla");
        System.out.println("is there any 0 in the names in array ");
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i));
            String s = names.get(i);
            if (s.contains("o")){
                System.out.println(" "+"Yes");
            }else{
                System.out.println(" "+"No");
            }
            }
        }
}
