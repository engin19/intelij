package reviewWeek12;

public class E2Exception {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(1);
        System.out.println(2);
        try{
        int[] arr = new int[2];
        arr[5] = 10;}
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Please make sure your index is correct");
            a.printStackTrace();
            System.out.println(a);

        }

    }
}