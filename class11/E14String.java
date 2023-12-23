package class11;

public class E14String {
    public static void main(String[] args) {
        String str="SFKDFJEDVKELVDFKJJJfjdgfhdsjsdj12354@#$%^&";
        System.out.println(str.replaceAll("[A-Z]","*"));
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[1-9]","*"));
        System.out.println(str.replaceAll("[A-Za-z0-9]","*"));

        System.out.println(str.replaceAll("[^A-Za-z0-9]","*"));


        System.out.println(str.replaceAll("[1-9]",""));
        System.out.println((int)'A');
        System.out.println((int)'a');



    }
}
