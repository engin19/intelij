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
            for (int j =i+1; j <names.size(); j++) {
                if (names.get(i).equals(names.get(j))){
                    names.remove(i);

            }System.out.println(names);
        }

        }


    }
}
