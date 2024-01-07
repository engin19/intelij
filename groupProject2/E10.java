package groupProject2;

import java.util.ArrayList;

public class E10 {
    //How can you remove all duplicates from ArrayList?
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Aileen");
        names.add("Aileen");
        names.add("Adriana");
        names.add("Aileen");
        names.add("Adriana");
        names.add("Engin");
        for (int i = 0; i <names.size() ; i++) {
            for (int j = names.size()-1; j >0; j--) {
                if (names.get(i).equals(names.get(j))){
                    names.remove(i);
                    break;


            }
                System.out.println(names);


            }
        }
    }
}
