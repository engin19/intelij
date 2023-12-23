package homework;

public class ReverseString {
    //Create a method that will take a String as a
    // parameter and returns reversed String. Method should be available
    // to all classes within your project and accessible by class name.
   public static String str(String name) {
       String reverse="";
       for (int i = name.length()-1; i >=0 ; i--) {
           reverse=reverse+name.charAt(i);
       }return reverse;
   }

    public static void main(String[] args) {
        System.out.println(str("engin ozdemir"));
    }
}
