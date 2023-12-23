package class12;

public class E10StringDemo {
    public static void main(String[] args) {
        String str="Its Savera's Birthday today. It is Sunday. Today is Java Class.";
       String[]  Arrstr = str.split("[.]");
        System.out.println(Arrstr.length);
        System.out.println(Arrstr[2].trim());
        System.out.println(Arrstr[0].trim());
        System.out.println(Arrstr[1].trim());

    }
}
