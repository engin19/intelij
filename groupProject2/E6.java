package groupProject2;

public class E6 {
    public static void main(String[] args) {
        String string1="SYNTAX STUDENTS IN THE BATCH EIGHTEEN";
        String str=string1.toLowerCase();
        str.replaceAll("[^a,e,i,o,u]","");
        System.out.println(str);
        System.out.println(str.length());

    }
}
