package class22;

import java.util.ArrayList;

public class EvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers=new ArrayList<>();
        for (int i = 2; i <= 500; i=i+2) {
            evenNumbers.add(i);
            }
        System.out.println(evenNumbers);
        for (int j = 0; j <evenNumbers.size() ; j++) {
            if (evenNumbers.get(j)%5==0){
                evenNumbers.remove(j);
            }

        } System.out.println(evenNumbers);
        }


    }

