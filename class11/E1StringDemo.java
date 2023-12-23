package class11;

public class E1StringDemo {
    public static void main(String[] args) {
        // create the object of that class
        /*String is the data type
        Str= Data type
        new String()= creating the object of String
         */
       String str=new String("Hello World");
       str.length();
       //calling the length of the method using the str object
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println((str+" Hello Batch 18"));

    }
}
