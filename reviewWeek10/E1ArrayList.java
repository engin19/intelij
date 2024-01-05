package reviewWeek10;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
        //every primitive datatype has a class created by developers
        // int=(primitive data type)=> Integer (class )
        //data type of names is ArrayList of Integers=

        ArrayList<Integer> numbers=new ArrayList<Integer>();

        Integer i=new Integer(12);

        Integer j=12;
        numbers.add(12);
        numbers.add(10);
        numbers.add(30);
        numbers.add(1235);
        numbers.add(123);
        System.out.println(numbers);
        for (int k = 0; k <numbers.size() ; k++) {
            System.out.print(numbers.get(k)+" ");

        }
for (Integer l:numbers){
    System.out.print(l+" ");

}
    }
}
