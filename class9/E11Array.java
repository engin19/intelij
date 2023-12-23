package class9;

public class E11Array {
    public static void main(String[] args) {
        String [][] grocery={
                {"bread","cake","flour"},
                {"coke" ,"water","OJ"},
                {"orange","apple","banana"}
        };
        for (int i = 0; i < grocery.length; i++) {
            for (int j = 0; j < grocery[i].length; j++)
            System.out.print(grocery[i][j] + " ");
            System.out.println(" ");
        }


    }
}

