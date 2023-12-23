package reviewWeek6;

public class E2StringDemo {
    public static void main(String[] args) {
        String str="Today is JAVA review class";
        System.out.println(str.charAt(3));
        for (int i = 0; i < str.length(); i+=2) {
            System.out.print(str.charAt(i)+" ");


        }
    }
}
