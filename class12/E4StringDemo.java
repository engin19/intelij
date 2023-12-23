package class12;

public class E4StringDemo {
    public static void main(String[] args) {
        String abc="ASDFGHJawertyuio!@#$%^&*78965";

        String abd=abc.replaceAll("[^A-Za-z]","");
        System.out.println(abd.length());
        System.out.println(abd);
    }
}
